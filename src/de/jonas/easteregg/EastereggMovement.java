package de.jonas.easteregg;

import java.util.Timer;
import java.util.TimerTask;

public class EastereggMovement {
	
	Timer move;

	public EastereggMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(EastereggVariablen.MoveLeft == true) {
					if(EastereggVariablen.HeadX >= 10) {
						EastereggVariablen.HeadX -= EastereggVariablen.speed;
					}
				} else if(EastereggVariablen.MoveUp == true) {
					if(EastereggVariablen.HeadY >= 10) {
						EastereggVariablen.HeadY -= EastereggVariablen.speed;
					}
				} else if(EastereggVariablen.MoveRight == true) {
					if(EastereggVariablen.HeadX <= EastereggVariablen.FrameWidth - 45 ) {
						EastereggVariablen.HeadX += EastereggVariablen.speed;
					}
				} else if(EastereggVariablen.MoveDown == true) {
					if(EastereggVariablen.HeadY <= EastereggVariablen.FrameHeight - 65) {
						EastereggVariablen.HeadY += EastereggVariablen.speed;
					}
				}
			}
		}, 0, 6);
	}

}
