package com.ysh.swingex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmButtonActionListener implements ActionListener {
	JTextField text;
	JLabel label;

	public ConfirmButtonActionListener(JTextField text, JLabel label) {

		this.text = text;
		this.label = label;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
