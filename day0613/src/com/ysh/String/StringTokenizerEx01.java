package com.ysh.String;
/*
 * java.util ��Ű���� ����
 * "2022/06/13" �̶�� ���ڿ��� delim(�����ڵ�/��)���� 2022,06,13����
 * �и��Ҷ� �����
 * ������ ���ڿ��� ��ū�̶�� ��
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
		String str = "���� �״븦 �������� �����ϰų� �뿩������";
		StringTokenizerEx01 st1 = new StringTokenizerEx01("Happy Day");
		st1.print();
		System.out.println();
		StringTokenizerEx01 st2 = new StringTokenizerEx01("2022/06/13", "/");
		st2.print();
	}

}
