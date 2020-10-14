package de.jonas.easteregg;

import javax.swing.JFrame;

public class EastereggGUI {

	public EastereggGUI() {
		JFrame frame = new JFrame("                                                                                                       !! -> RUN <- !!");
		frame.setBounds(0, 0, EastereggVariablen.FrameWidth, EastereggVariablen.FrameHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.requestFocus();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.addKeyListener(new EastereggKeyHandler());
		
		EastereggDraw labelDraw = new EastereggDraw();
		labelDraw.setBounds(0, 0, EastereggVariablen.FrameWidth, EastereggVariablen.FrameHeight);
		labelDraw.setVisible(true);
		
		frame.add(labelDraw);
		frame.setVisible(true);
	}

}
