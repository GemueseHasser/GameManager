package de.jonas.pong;

import java.io.IOException;

public class MainPong {
	
	public MainPong() throws IOException {
		new GUIPong();
		new Variablen();
		new Movement();
		new BotMovement();
		new BallMovement();
		new BallKollision();
	}

}
