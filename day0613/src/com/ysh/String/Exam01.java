package com.ysh.String;

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {

		// 랜덤 객체 생성
		Random r = new Random();

		// 스택 객체 생성
		Stack st = new Stack();

		int nNum, i;// nNum : 랜덤으로 생성된 정수를 저장하는 변수.

		// 10개의 생성된 랜덤 수를 스택에 저장
		System.out.print("스택에 저장된 수 : ");
		for (i = 0; i < 10; i++) {

			r.setSeed(r.nextLong());// seed 생성

			nNum = (r.nextInt() % 100);// 0~99(100개) 사이의 숫자를 생성하라.

			st.push(nNum);// 스택에 저장
			System.out.print(" " + nNum);

		}
		System.out.println();
		// 스택에 저장된 수를 출력
		System.out.print("스택에 저장된 수 출력 : ");
		for (i = 0; i < 10; i++) {
			System.out.print(st.pop() + " ");
		}

	}

}
