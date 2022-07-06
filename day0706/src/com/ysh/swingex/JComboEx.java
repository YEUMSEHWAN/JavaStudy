package com.ysh.swingex;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class JComboEx extends JFrame {

	public JComboEx() {
		super("JCombox Test");
		setLayout(new FlowLayout());

		String[] citems = { "One", "Two", "Three", "Four", "Five" };

		JComboBox<String> combo = new JComboBox<>(citems);
		add(combo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
