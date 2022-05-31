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

	public static int div(int x, int y) {// /(몫을 구함)
		return x / y;

	}

	public static int per(int x, int y) {// %
		return x % y;

	}

	// a : 첫번째 수, b : 연산자, c : 두번째수, d : 결과값
	public static void disp(int a, char b, int c, int d) {
		System.out.println("\n " + a + " " + b + " " + c + "=" + d);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 변수 선언
		int su1 = 0, su2 = 0, total = 0;
		char yon = 0;

		// 첫번째 수 입력
		System.out.printf("첫번째 수 : ");
		su1 = Integer.parseInt(br.readLine());

		// 연산자
		do {
			System.out.print("yon(+,-,*,/,%) : ");
			yon = (char) System.in.read();
			// System.in.read();
			// System.in.read();
			System.in.skip(2);

		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/' && yon != '%');

		// 두번째 수 입력
		System.out.printf("두번째 수 : ");
		su2 = Integer.parseInt(br.readLine());

		// 연산자를 조건으로 해서 처리

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
