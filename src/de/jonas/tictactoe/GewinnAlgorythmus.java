package de.jonas.tictactoe;

import java.util.Timer;
import java.util.TimerTask;

public class GewinnAlgorythmus {
	
	Timer time;

	public GewinnAlgorythmus() {
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(GUI.gewinner == 0) {
					//Für X
					if(GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[3] == 1 && GUI.state[4] == 1 && GUI.state[5] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[0] == 1 && GUI.state[3] == 1 && GUI.state[6] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[1] == 1 && GUI.state[4] == 1 && GUI.state[7] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[2] == 1 && GUI.state[5] == 1 && GUI.state[8] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[0] == 1 && GUI.state[4] == 1 && GUI.state[8] == 1) {
						GUI.gewinner = 1;
					} else if(GUI.state[2] == 1 && GUI.state[4] == 1 && GUI.state[6] == 1) {
						GUI.gewinner = 1;
					}
					//Für O
					if(GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[3] == 2 && GUI.state[4] == 2 && GUI.state[5] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[0] == 2 && GUI.state[3] == 2 && GUI.state[6] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[1] == 2 && GUI.state[4] == 2 && GUI.state[7] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[2] == 2 && GUI.state[5] == 2 && GUI.state[8] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[0] == 2 && GUI.state[4] == 2 && GUI.state[8] == 2) {
						GUI.gewinner = 2;
					} else if(GUI.state[2] == 2 && GUI.state[4] == 2 && GUI.state[6] == 2) {
						GUI.gewinner = 2;
					}
				}
			}
		}, 0, 150);
	}

}
