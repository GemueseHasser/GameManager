package de.jonas.pong;

import javax.swing.JFrame;

public class GUIPong {
	
	public GUIPong() {
		Variablen.frame = new JFrame();
		Variablen.frame.setTitle("Pong");
		Variablen.frame.setBounds(0, 0, Variablen.frameWidth, Variablen.frameHeight);
		Variablen.frame.setLocationRelativeTo(null);
		Variablen.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variablen.frame.setLayout(null);
		Variablen.frame.setResizable(false);
		Variablen.frame.addKeyListener(new KeyHandler());
		Variablen.frame.requestFocus();
		
		DrawPong labelDraw = new DrawPong();
		labelDraw.setBounds(0, 0, Variablen.frameWidth, Variablen.frameHeight);
		labelDraw.setVisible(true);
		
		Variablen.frame.add(labelDraw);
		Variablen.frame.setVisible(true);
	}

}
