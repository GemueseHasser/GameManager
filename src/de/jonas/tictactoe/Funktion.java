package de.jonas.tictactoe;

public class Funktion {
	
	public static void reset() {
		for(int i = 0; i<GUI.state.length; i++) {
			GUI.state[i] = 0;
		}
		
		GUI.player = 0;
		GUI.gewinner = 0;
	}

}
