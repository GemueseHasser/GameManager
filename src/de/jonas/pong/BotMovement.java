package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

public class BotMovement {
	
	Timer move;

	public BotMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variablen.ballX >= Variablen.frameWidth/2 - 10) {
					if(Variablen.ballY == Variablen.gegenerY) {
						
					} else if(Variablen.ballY > Variablen.gegenerY +75) {
						if(Variablen.gegenerY <= Variablen.frameHeight - 200) {
							Variablen.gegenerY += 2;
						}
					} else if(Variablen.ballY < Variablen.gegenerY +75) {
						if(Variablen.gegenerY >= 20) {
							Variablen.gegenerY -= 2;
						}
					}
				}
				
			}
		}, 0, 6);
	}

}
