package de.jonas.easteregg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EastereggMain {

	public EastereggMain() {
		startEasteregg();
	}
	
	private static JFrame startEasteregg() {
		JFrame frame = new JFrame("Kurze Erklärung");
		frame.setBounds(0, 0, 500, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.requestFocus();
		frame.setLayout(null);
		
		JLabel label = new JLabel("Das Easteregg:", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 500, 100);
		
		JLabel Erklaerung = new JLabel("Mit den Pfeiltasten kannst du den Roten Punkt", JLabel.CENTER);
		Erklaerung.setBounds(0, 100, 500, 500);
		Erklaerung.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel ErklaerungI = new JLabel("steuern und mit der Leertaste öffnet sich das", JLabel.CENTER);
		ErklaerungI.setBounds(0, 130, 500, 500);
		ErklaerungI.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel ErklaerungII = new JLabel("Game-Menü", JLabel.CENTER);
		ErklaerungII.setBounds(0, 160, 500, 500);
		ErklaerungII.setFont(new Font("Arial", Font.BOLD, 20));
		
		JButton button = new JButton("Weiter");
		button.setOpaque(true);
		button.setBackground(Color.MAGENTA);
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setBounds(0, 600, 500, 100);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new EastereggGUI();
				new EastereggMovement();
			}
		});
		
		frame.add(label);
		frame.add(Erklaerung);
		frame.add(ErklaerungI);
		frame.add(ErklaerungII);
		frame.add(button);
		frame.setVisible(true);
		return frame;
	}

}
