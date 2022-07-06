package com.ysh.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class wondowExam01 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swimg Programming");
		frame.setPreferredSize(new Dimension(200, 70));
		frame.setLocation(500, 400);
		Container contentpane = frame.getContentPane();
		JTextField text = new JTextField();
		JLabel label = new JLabel("Hello ");
		JButton button = new JButton("»Æ¿Œ");
		contentpane.add(text, BorderLayout.CENTER);
		contentpane.add(button, BorderLayout.EAST);
		contentpane.add(label, BorderLayout.SOUTH);

		ActionListener listener = new ConfirmButtonActionListener(text, label);
		button.addActionListener(listener);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
