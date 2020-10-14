package de.jonas.pong;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.JFrame;

public class Variablen {
	
	static JFrame frame;
	static int frameWidth = 800, frameHeight = 600;
	
	static int x = 20, y = 185;
	static int gegnerX = 750, gegenerY = 185;
	static int ballX = 200, ballY = 100;
	static boolean moveup = false, movedown = false;
	
	static int ballDirectionX = 1, ballDirectionY = -1;
	
	static int PlayerPoints = 0, GegnerPoints = 0;
	
	static Font pixelFont;
	
	public Variablen() throws IOException {
		
		URL url = getClass().getResource("/de/jonas/font/coders_crux.ttf");
		InputStream font = url.openStream();
		
		try {
			pixelFont = Font.createFont(Font.TRUETYPE_FONT, font).deriveFont(125f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, font));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}
