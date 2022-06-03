package com.ysh.exception;

import java.util.*;

public class InputExcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 3개를 입력하세요.");

		int sum = 0, n = 0;

		for (int i = 0; i < 3; i++) {
			System.out.printf((i + 1) + "번째 정수입력 : ");

			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("문자는 정수가 아닙니다. 정수를 입력해주세요.");
				// 현재 입력스트림에 남아있는 토근을 지운다.(문자도 더하기때문에 지워야함)
				sc.nextLine();
				i--;// 인덱스가 증가하지 않도록 미리 감소시킴.
				continue;

			}

			sum += n;
		}
		System.out.println("정수 3개의 합은 : " + sum);

	}

}
