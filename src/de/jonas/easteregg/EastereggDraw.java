package de.jonas.easteregg;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class EastereggDraw extends JLabel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, EastereggVariablen.FrameWidth, EastereggVariablen.FrameHeight);
		
		g.setColor(new Color(EastereggVariablen.h, EastereggVariablen.s, EastereggVariablen.b));
		
		g.fillRect(EastereggVariablen.HeadX, EastereggVariablen.HeadY, 20, 20);
		
		g.setColor(Color.CYAN);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		
		g.drawString("X:" + EastereggVariablen.HeadX, 20, 40);
		g.drawString("Y:" + EastereggVariablen.HeadY, 20, 80);
		g.drawString("Speed:" + EastereggVariablen.speed, 20, 120);
		
		repaint();
	}
	
	
	
}
