package com.ysh.utilex;
/*
 * ���۶�?
 *  - ���۴� �����͸� �Ѱ����� �ٸ� �Ѱ����� �����ϴ� ���� �Ͻ������� �� �����͸� 
 *    �����ϴ� �޸��� ������ �ǹ���(�ӽø޸𸮰���)
 * ���۸�(Buffering)�̶�?
 * 	- ���۸� ä��� ������ �ǹ���.
 *  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferEx {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.printf("���ڿ� �Է� : ");
//		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer("JAVA");
//		System.out.println(sb);
//		System.out.println(sb.capacity());
		sb.append("1.8");
		System.out.println(sb);
		
		
		
		
	}

}
