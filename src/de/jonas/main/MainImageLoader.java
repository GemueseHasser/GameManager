package de.jonas.main;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MainImageLoader {
	
	static Image Easteregg;

	public MainImageLoader() {
		try {
			Easteregg = ImageIO.read(getClass().getResource("/de/jonas/image/Easteregg.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
