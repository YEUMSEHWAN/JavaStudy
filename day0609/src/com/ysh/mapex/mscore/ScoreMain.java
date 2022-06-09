package com.ysh.mapex.mscore;

import java.io.*;

public class ScoreMain {

	public static void main(String[] args) throws IOException {

		Score score = new ScoreImpl();
		char ch;
		System.out.println(">>    ���� ó��    <<");
		while (true) {

			do {
				System.out.print("\n1.��� : ");
				System.out.print("2.���� : ");
				System.out.print("3.�̸� �˻� : ");
				System.out.print("4.���� : ");
				System.out.print("5.��ü ��� : ");
				System.out.print("6.(������)��ü��� : ");
				System.out.println("7.���� : ");
				System.out.print("�޴��� �������ּ��� : ");
				ch = (char) System.in.read();
				System.in.skip(2);

			} while (ch < '1' || ch > '7');

			switch (ch) {
			case '1':
				score.insert();
				break;
			case '2':
				score.update();
				break;
			case '3':
				score.search();
				break;
			case '4':
				score.delete();
				break;
			case '5':
				score.writeAll();
				break;
			case '6':
				score.writeSort();
				break;
			case '7':
				System.out.println("�����մϴ�.");
				System.exit(0);
				break;
			}
		}

	}

}
