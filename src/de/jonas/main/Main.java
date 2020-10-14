package de.jonas.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import de.jonas.easteregg.EastereggMain;
import de.jonas.pong.MainPong;
import de.jonas.tictactoe.StartGame;

public class Main {
	
	private static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

	public static void main(String[] args) {
		startMen¸();
	}
	
	private static JFrame startMen¸() {
		JFrame frame = new JFrame("Game-Manager");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("W‰hle dein Spiel aus:");
		label.setFont(new Font("Arial", Font.BOLD, 40));
		label.setBounds(180, -450, size.width, size.height);
		frame.setBounds(0, 0, 800, 900);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.requestFocus();
	    panel.setLayout(null);
	    panel.setOpaque(true);
	    panel.setBackground(Color.CYAN);
	    
	    JButton TicTacToe = new JButton("Tic-Tac-Toe");
	    TicTacToe.setFont(new Font("Arial", Font.BOLD, 20));
	    TicTacToe.setBounds(200, 200, 400, 100);
	    TicTacToe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new StartGame();
			}
		});
	    
	    JButton Pong = new JButton("Pong");
	    Pong.setFont(new Font("Arial", Font.BOLD, 20));
	    Pong.setBounds(200, 350, 400, 100);
	    Pong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				try {
					new MainPong();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	    
	    JButton easteregg = new JButton("Sinnloses-Easteregg");
	    easteregg.setBounds(200, 485, 400, 50);
	    easteregg.setFont(new Font("Arial", Font.BOLD, 20));
	    easteregg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new EastereggMain();
			}
		});
	    
	    JButton exit = new JButton("Schlieﬂen");
	    exit.setFont(new Font("Arial", Font.BOLD, 20));
	    exit.setBounds(200, 700, 400, 100);
	    exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Abfrage();
			}
		});
	    
	    
	    panel.add(label);
	    panel.add(TicTacToe);
	    panel.add(Pong);
	    panel.add(easteregg);
	    panel.add(exit);
	    frame.add(panel);
	    frame.setVisible(true);
		return frame;
	}
	
	private static JFrame Abfrage() {
		JFrame frame = new JFrame("Schlieﬂen");
	    JPanel panel = new JPanel();
	    JLabel label = new JLabel("Wirklich beenden?");
	    label.setForeground(Color.RED);
	    label.setFont(new Font("Arial", Font.BOLD, 20));
	    label.setBounds(100, 0, 400, 50);
	    frame.setBounds(0, 0, 400, 250);
	    frame.setLocationRelativeTo(null);
	    panel.setLayout(null);
	    
	    JButton Schlieﬂen = new JButton("Schlieﬂen");
	    Schlieﬂen.setFont(new Font("Arial", Font.BOLD, 15));
	    Schlieﬂen.setBounds(40, 70, 300, 30);
	    Schlieﬂen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	    
	    JButton Nicht = new JButton("Ich hab¥s mir doch anders ¸berlegt");
	    Nicht.setFont(new Font("Arial", Font.BOLD, 15));
	    Nicht.setBounds(40, 130, 300, 30);
	    Nicht.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	    
	    panel.add(label);
	    panel.add(Schlieﬂen);
	    panel.add(Nicht);
	    frame.add(panel);
	    frame.setVisible(true);
	    return frame;
	}

}
