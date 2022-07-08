package com.ysh.swingex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JOptionpaneEx extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4;
	String[] str = { "로그인", "회원가입" };

	public JOptionpaneEx() {

		super("JOptionpane test");
		setLayout(new FlowLayout());

		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");

		add(b1);
		add(b2);
		add(b3);
		add(b4);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 300);
		pack();
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(this, "메시지 다이얼로그 박스", "메시지", JOptionPane.INFORMATION_MESSAGE);
		} else if (e.getSource() == b2) {
			JOptionPane.showConfirmDialog(this, "확인다이얼로그박스", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
		} else if (e.getSource() == b3) {
			JOptionPane.showInputDialog(this, "입력다이얼로그박스", "입력", JOptionPane.YES_NO_OPTION);
		} else if (e.getSource() == b4) {
			JOptionPane.showOptionDialog(this, "옵션다이얼로그박스", "옵션", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);

		}

	}

	public static void main(String[] args) {
		new JOptionpaneEx();
	}

}
