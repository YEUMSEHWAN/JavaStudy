package com.ysh.exception4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcExam {

	private static BufferedReader br;

	static {// ����
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) throws IOException {
		int su1 = 0, su2 = 0, su3 = 0;
		char yon = 0, flag = 0;
		int tot = 0;

		while (true) {

			do {
				flag = 0;
				try {
					System.out.println("ù���� �� : ");
					su1 = Integer.parseInt(br.readLine());
				} catch (NumberFormatException ne) {
					System.out.println("���ڸ� �����մϴ�.");
					flag = 1;
				}
			} while (flag != 0);
			do {
				flag = 0;

				String str = "";
				try {
					System.out.println("������(+,=,*,/) : ");
					str = br.readLine();
					yon = str.charAt(0);
					// (char)System.in.read();
				} catch (StringIndexOutOfBoundsException Soe) {
					System.out.println("���ڸ� ���� �մϴ�.");
					flag = 1;
				}

				if (str.length() != 1) {
					System.out.println("�����ڴ� 1�ڸ��� �ϼž� �մϴ�.");
					flag = 1;
				}

			} while (flag != 0 || yon != '+' && yon != '-' && yon != '*' && yon != '/');
			do {
				flag = 0;
				try {
					System.out.println("�ι�° �� : ");
					su2 = Integer.parseInt(br.readLine());

				} catch (NumberFormatException nfe) {
					System.out.println("���ڸ� �����մϴ�.");
					flag = 1;
				}
				while (flag != 0)
					;
				try {
					switch (yon) {
					case '+':
						tot = su1 + su2;
						break;
					case '-':
						tot = su1 - su2;
						break;
					case '*':
						tot = su1 * su2;
						break;
					case '/':
						tot = su1 / su2;
						break;
					}

				} catch (ArithmeticException ae) {
					System.out.println("0���� ���� �� �����ϴ�.");
					flag = 1;
				}

			} while (flag != 0);
			System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
		}
	}
}
