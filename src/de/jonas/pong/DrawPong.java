package de.jonas.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DrawPong extends JLabel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Variablen.frameWidth, Variablen.frameHeight);
		
		g.setColor(Color.WHITE);
		
		for(int i=0;i<=30;i++) {
			g.fillRect(Variablen.frameWidth/2 -5, i * 20, 10, 10);
		}
		
		g.fillRect(Variablen.x, Variablen.y, 25, 150);
		g.fillRect(Variablen.gegnerX, Variablen.gegenerY, 25, 150);
		
		g.setFont(Variablen.pixelFont);
		g.drawString("" + Variablen.PlayerPoints, Variablen.frameWidth/2 -95, 75);
		g.drawString("" + Variablen.GegnerPoints, Variablen.frameWidth/2 + 50, 75);
		
		g.fillRect(Variablen.ballX, Variablen.ballY, 20, 20);
		
		
		repaint();
	}

}
