package de.jonas.tictactoe;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
static Image imgX, imgO;
	
	public ImageLoader() {
		try {
			imgX = ImageIO.read(getClass().getResource("/de/jonas/image/x.png"));
			imgO = ImageIO.read(getClass().getResource("/de/jonas/image/o.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
