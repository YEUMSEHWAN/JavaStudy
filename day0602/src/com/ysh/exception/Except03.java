package com.ysh.exception;

public class Except03 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("true");
			}
		} catch (NullPointerException ne) {
			if (ne instanceof NullPointerException) {

				System.out.println("NullPointerException");
				System.out.println("ArithmeticException");
			}
		} catch (Exception e) {
			System.out.println("Exception..");
		} finally {
			// 무조건 실행...
			System.out.println(6);
		}
		System.out.println(5);
	}
}
