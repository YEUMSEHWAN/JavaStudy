package com.ysh.String;
/*
 * java.util 패키지에 포함
 * "2022/06/13" 이라는 문자열을 delim(구분자들/로)각각 2022,06,13으로
 * 분리할때 사용함
 * 각각의 문자열을 토큰이라고 함
 */

import java.util.*;
import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	StringTokenizer st;

	public StringTokenizerEx01(String str) {

		st = new StringTokenizer(str);
	}

	public StringTokenizerEx01(String str, String delim) {
		System.out.println("str + " + str);
		st = new StringTokenizer(str, delim);
	}

	public void print() {

		System.out.println("token count : " + st.countTokens());
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

	public static void main(String[] args) {
		String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워말라";
		StringTokenizerEx01 st1 = new StringTokenizerEx01("Happy Day");
		st1.print();
		System.out.println();
		StringTokenizerEx01 st2 = new StringTokenizerEx01("2022/06/13", "/");
		st2.print();
	}

}
