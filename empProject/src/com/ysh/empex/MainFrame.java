package com.ysh.empex;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private JTabbedPane tp;
	private Addpane ap;

	public MainFrame() {
		tp = new JTabbedPane();
		ap = new Addpane();

		tp.addTab("��������Է�", ap);

		getContentPane().add(tp);
		setTitle("������� ���α׷�");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);

	}

}
