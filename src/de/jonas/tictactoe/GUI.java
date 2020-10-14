package de.jonas.tictactoe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {
	
	JFrame frame;
	Draw draw;
	
	JButton resetButton;
	
	static JButton button[] = new JButton[9];
	
	static int state[] = new int[9];
	
	static int player = 0;
	
	static int gewinner = 0;
	
	public GUI() {
		frame = new JFrame();
		frame.setSize(new Dimension(800,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Tic Tac Toe");
		
		for(int i = 0; i<button.length; i++) {
			button[i] = new JButton();
			button[i].setVisible(true);
			button[i].addActionListener(new ActionHandler());
			button[i].setFocusPainted(false);
			button[i].setContentAreaFilled(false);
			button[i].setBorder(null);
			frame.add(button[i]);
		}
		
		ButtonPlacement.place();
		
		resetButton = new JButton("Reset");
		resetButton.setBounds(675, 500, 100, 40);
		resetButton.setBackground(new Color(51, 102, 153));
		resetButton.setVisible(true);
		resetButton.setForeground(Color.WHITE);
		resetButton.setFocusPainted(false);
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Funktion.reset();
			}
		});
		
		frame.add(resetButton);
		
		draw = new Draw();
		draw.setBounds(0,0,800,600);
		draw.setVisible(true);
		
		frame.add(draw);
		frame.setVisible(true);
	}

}
