package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	
	Timer move;

	public Movement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variablen.moveup == true ) {
					if(Variablen.y >= 20) {
						Variablen.y -= 2;
					}
				} else if(Variablen.movedown == true) {
					if(Variablen.y <= Variablen.frameHeight - 200) {
						Variablen.y += 2;
					}
				}
				
			}
		}, 0, 6);
	}

}
