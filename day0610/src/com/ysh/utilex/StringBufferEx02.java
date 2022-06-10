package com.ysh.utilex;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println(sb.capacity());// 16+10
		System.out.println(sb.length());// 10
		System.out.println("ABCDEFGHIJKLMNOPQ");
		System.out.println(sb.capacity());// 54
		System.out.println(sb.length());// 27
		sb.delete(1, 20);//10
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
