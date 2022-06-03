package com.ysh.exception3;

public class ExceptionTest02 {

	public static void main(String[] args) throws Exception {

		int x = 100;
		int y = 0;
		int total = 0;
		try {
			total = x / y;
		} catch (ArithmeticException ae) {
			MyException me = new MyException("³ª´©±â", ae);
			// throw me;
			me.printStackTrace();
			
			

		}
		System.out.println("Total : " + total);

	}

}
