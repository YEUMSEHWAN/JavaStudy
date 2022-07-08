package com.ysh.swingex;

import java.awt.*;
import javax.swing.*;

public class WindowExam02 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("참가자 명단 프로그램");

		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500, 400);
		Container contenePane = frame.getContentPane();

		String colNames[] = { "이름", "나이", "성별" };

		Object data[][] = { { "홍길동", 24, "남" }, { "이순신", 22, "남" }, { "오영미", 27, "여" } };

		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);

		contenePane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contenePane.add(button, BorderLayout.SOUTH);

		button.addActionListener(new PrintActionListener(table));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
