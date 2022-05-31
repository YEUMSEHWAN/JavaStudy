package study;

import java.io.*;

public class MethodEx03 {
						//  su1 , su2 (line No.70)
	public static int plus(int x, int y) {// +
		return x + y;

	}

	public static int min(int x, int y) {// -
		return x - y;

	}

	public static int mul(int x, int y) {// *
		return x * y;

	}

	public static int div(int x, int y) {// /(���� ����)
		return x / y;

	}

	public static int per(int x, int y) {// %
		return x % y;

	}

	// a : ù��° ��, b : ������, c : �ι�°��, d : �����
	public static void disp(int a, char b, int c, int d) {
		System.out.println("\n " + a + " " + b + " " + c + "=" + d);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ���� ����
		int su1 = 0, su2 = 0, total = 0;
		char yon = 0;

		// ù��° �� �Է�
		System.out.printf("ù��° �� : ");
		su1 = Integer.parseInt(br.readLine());

		// ������
		do {
			System.out.print("yon(+,-,*,/,%) : ");
			yon = (char) System.in.read();
			// System.in.read();
			// System.in.read();
			System.in.skip(2);

		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/' && yon != '%');

		// �ι�° �� �Է�
		System.out.printf("�ι�° �� : ");
		su2 = Integer.parseInt(br.readLine());

		// �����ڸ� �������� �ؼ� ó��

		switch (yon) {

		case '+':
			//total = su1 + su2;
			total = plus(su1,su2);
			break;
		case '-':
			//total = su1 - su2;
			total = min(su1,su2);
			break;
		case '*':
			//total = su1 * su2;
			total = mul(su1,su2);
			break;
		case '/':
			//total = su1 / su2;
			total = div(su1,su2);
			break;
		case '%':
			//total = su1 % su2;
			total = per(su1,su2);
			break;

		}
		//System.out.println(su1 + " " + yon + " " + su2 + "=" + total);
		disp(su1, yon, su2, total);
	}

}
