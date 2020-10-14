package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
	
	Timer move;

	public BallMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				Variablen.ballX += Variablen.ballDirectionX;
				Variablen.ballY += Variablen.ballDirectionY;
			}
		}, 0, 4);
	}

}
