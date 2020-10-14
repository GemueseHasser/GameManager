package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
	
	Timer kollision;

	public BallKollision() {
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Variablen.ballY +50 >= Variablen.frameHeight) {
					Variablen.ballDirectionY = -1;
				}
				
				if(Variablen.ballY <= 0) {
					Variablen.ballDirectionY = 1;
				}
				
				if(Variablen.ballX +20 >= Variablen.frameWidth) {
					Variablen.ballX = Variablen.frameWidth/2 -10;
					Variablen.ballY = Variablen.frameHeight/2 -10;
					
					Variablen.ballDirectionX = -1;
					Variablen.PlayerPoints += 1;
				}
				
				if(Variablen.ballX <= 0) {
					Variablen.ballX = Variablen.frameWidth/2 -10;
					Variablen.ballY = Variablen.frameHeight/2 -10;
					
					Variablen.ballDirectionX = 1;
					Variablen.GegnerPoints += 1;
				}
				
				
				if(Variablen.ballX < Variablen.x +25 && Variablen.ballX > Variablen.x && Variablen.ballY -20 < Variablen.y + 150 && Variablen.ballY > Variablen.y) {
					Variablen.ballDirectionX = 1;
				}
				
				if(Variablen.ballX < Variablen.gegnerX && Variablen.ballX > Variablen.gegnerX -20 && Variablen.ballY -20 < Variablen.gegenerY + 150 && Variablen.ballY > Variablen.gegenerY) {
					Variablen.ballDirectionX = -1;
				}
				
			}
		}, 0, 4);
	}

}
