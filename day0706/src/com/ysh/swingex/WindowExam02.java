package com.ysh.swingex;

import java.awt.*;
import javax.swing.*;

public class WindowExam02 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("������ ��� ���α׷�");

		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500, 400);
		Container contenePane = frame.getContentPane();

		String colNames[] = { "�̸�", "����", "����" };

		Object data[][] = { { "ȫ�浿", 24, "��" }, { "�̼���", 22, "��" }, { "������", 27, "��" } };

		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);

		contenePane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("���");
		contenePane.add(button, BorderLayout.SOUTH);

		button.addActionListener(new PrintActionListener(table));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
