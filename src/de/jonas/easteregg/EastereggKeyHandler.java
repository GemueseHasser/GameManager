package de.jonas.easteregg;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EastereggKeyHandler implements KeyListener {
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			EastereggVariablen.MoveLeft = true;
		} else if(e.getKeyCode() == KeyEvent.VK_UP) {
			EastereggVariablen.MoveUp = true;
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			EastereggVariablen.MoveRight = true;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			EastereggVariablen.MoveDown = true;
		} else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			menu();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			EastereggVariablen.MoveLeft = false;
		} else if(e.getKeyCode() == KeyEvent.VK_UP) {
			EastereggVariablen.MoveUp = false;
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			EastereggVariablen.MoveRight = false;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			EastereggVariablen.MoveDown = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private static JFrame menu() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout());
		frame.setBounds(0, 0, 350, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.requestFocus();
		
		JButton speed = new JButton("Geschwindigkeit");
		speed.setFont(new Font("Arial", Font.BOLD, 10));
		speed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Speed();
				frame.dispose();
			}
		});
		
		JButton color = new JButton("Farbe");
		color.setFont(new Font("Arial", Font.BOLD, 10));
		color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChooseColor();
				frame.dispose();
			}
		});
		
		frame.getContentPane().add(speed);
		frame.getContentPane().add(color);
		frame.setVisible(true);
		return frame;
	}
	
	private static JFrame ChooseColor() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout());
		frame.setBounds(0, 0, 400, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.requestFocus();
		
		JButton rot = new JButton();
		rot.setOpaque(true);
		rot.setBackground(Color.RED);
		rot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.s = 0;
				EastereggVariablen.b = 0;
				EastereggVariablen.h = 255;
				frame.dispose();
			}
		});
		
		JButton blau = new JButton();
		blau.setOpaque(true);
		blau.setBackground(Color.BLUE);
		blau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.h = 0;
				EastereggVariablen.s = 0;
				EastereggVariablen.b = 255;
				frame.dispose();
			}
		});
		
		frame.getContentPane().add(blau);
		frame.getContentPane().add(rot);
		frame.setVisible(true);
		return frame;
	}
	
	private static JFrame Speed() {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout());
		frame.setBounds(0, 0, 500, 200);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.requestFocus();
		
		JButton button = new JButton("1");
		button.setFont(new Font("Arial", Font.BOLD, 10));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 1;
				frame.dispose();
			}
		});
		
		JButton buttonI = new JButton("2");
		buttonI.setFont(new Font("Arial", Font.BOLD, 10));
		buttonI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 2;
				frame.dispose();
			}
		});
		
		JButton buttonII = new JButton("3");
		buttonII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 3;
				frame.dispose();
			}
		});
		
		JButton buttonIII = new JButton("4");
		buttonIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 4;
				frame.dispose();
			}
		});
		
		JButton buttonIIII = new JButton("5");
		buttonIIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 5;
				frame.dispose();
			}
		});
		
		JButton buttonIIIII = new JButton("6");
		buttonIIIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIIIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 6;
				frame.dispose();
			}
		});
		
		JButton buttonIIIIII = new JButton("7");
		buttonIIIIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIIIIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 7;
				frame.dispose();
			}
		});
		
		JButton buttonIIIIIII = new JButton("8");
		buttonIIIIIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIIIIIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 8;
				frame.dispose();
			}
		});
		
		JButton buttonIIIIIIII = new JButton("9");
		buttonIIIIIIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIIIIIIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 9;
				frame.dispose();
			}
		});
		
		JButton buttonIIIIIIIII = new JButton("10");
		buttonIIIIIIIII.setFont(new Font("Arial", Font.BOLD, 10));
		buttonIIIIIIIII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EastereggVariablen.speed = 10;
				frame.dispose();
			}
		});
		
		frame.getContentPane().add(button);
		frame.getContentPane().add(buttonI);
		frame.getContentPane().add(buttonII);
		frame.getContentPane().add(buttonIII);
		frame.getContentPane().add(buttonIIII);
		frame.getContentPane().add(buttonIIIII);
		frame.getContentPane().add(buttonIIIIII);
		frame.getContentPane().add(buttonIIIIIII);
		frame.getContentPane().add(buttonIIIIIIII);
		frame.getContentPane().add(buttonIIIIIIIII);
		frame.setVisible(true);
		return frame;
	}

}
