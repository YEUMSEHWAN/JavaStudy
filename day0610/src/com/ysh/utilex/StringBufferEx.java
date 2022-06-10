package com.ysh.utilex;
/*
 * 버퍼란?
 *  - 버퍼는 데이터를 한곳에서 다른 한곳으로 전공하는 동안 일시적으로 그 데이터를 
 *    보관하는 메모리의 영역을 의미함(임시메모리공간)
 * 버퍼링(Buffering)이란?
 * 	- 버퍼를 채우는 동작을 의미함.
 *  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferEx {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.printf("문자열 입력 : ");
//		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer("JAVA");
//		System.out.println(sb);
//		System.out.println(sb.capacity());
		sb.append("1.8");
		System.out.println(sb);
		
		
		
		
	}

}
