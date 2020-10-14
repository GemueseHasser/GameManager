package de.jonas.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			Variablen.moveup = true;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Variablen.movedown = true;
		} else if(e.getKeyCode() == KeyEvent.VK_PLUS) {
			Variablen.PlayerPoints++;
		} else if(e.getKeyCode() == KeyEvent.VK_MINUS) {
			if(Variablen.GegnerPoints == 0) {
				
			} else {
				Variablen.GegnerPoints--;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			Variablen.moveup = false;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Variablen.movedown = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}
