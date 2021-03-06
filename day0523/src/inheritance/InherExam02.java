package inheritance;

import java.io.*;

class AClass {
	protected int x;
	protected int y;// 두개의 정수
	protected char ch;// 연산자

	public AClass() {
	}

	public void write(double result) {
		System.out.printf("%d %c %d = %.2f\n", x, ch, y, result);

	}

}

class BClass extends AClass {
	// 데이터 입력 기능(메소드)
	boolean input() throws IOException {// 인스턴스 메소드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("임의의 두 정수 입력(공백 구분) : ");
		String temp = br.readLine();// "20 15"
		String[] str = temp.split("\\s");// {"20" , "15"}

		if (str.length != 2)
			return false;

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.printf("연산자 입력[+ , -, * , / ] : ");
		ch = (char) System.in.read();

		if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;

		return false;
	}

	// 연산 및 처리 기능(메소드)

	public double calc() {
		double result = 0;

		switch (ch) {

		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;

		}

		return result;
	}
}

public class InherExam02 {

	public static void main(String[] args) throws IOException {
		BClass bc = new BClass();

		if (!bc.input()) {
			System.out.println("Error!!");
			return;
		}
		double result = bc.calc();
		bc.write(result);

	}
}
