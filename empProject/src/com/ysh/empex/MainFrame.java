package com.ysh.empex;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private JTabbedPane tp;
	private Addpane ap;
	private FindPane fp;
	private TotalPane tpa;

	public MainFrame() {
		tp = new JTabbedPane();
		ap = new Addpane();
		fp = new FindPane();
		tpa = new TotalPane();

		tp.addTab("��������Է�", ap);
		tp.addTab("���������ȸ", fp);
		tp.addTab("��ü�����������", tpa);

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
