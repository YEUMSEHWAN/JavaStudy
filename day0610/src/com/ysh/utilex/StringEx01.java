package com.ysh.utilex;

/*String class
 *  - ���ڿ��� �ǹ��ϴ� Ŭ����
 *  - ��ü �ڷ���������, �⺻�ڷ���ó�� �����
 *  
 *  ������
 *  String() : ����ִ� ���ڿ� ��ü�� �����ϰ� �ʱ�ȭ
 *  String(char[] va) : ������ char�迭���� ������ ���������� �����Ͽ� ���ο� ���ڿ��� ������
 *  String(String original) : String���� original�� ���ڿ��� ���Ӱ� ������ ���ڿ���ü �ʱ�ȭ��
 *  
 *  ��ü ������
 *   �ڵ�(�Ͻ��� ��ü ����)
 *  String s1 = "Test";
 *  
 *  ����(����� ��ü ����)
 *  String s2 = new String("Test");
 */

public class StringEx01 {

	public static void main(String[] args) {

		String s1 = "TEST";
		String s2 = "TEST";

		if (s1 == s2) {//���� �ּҰ�
			System.out.println("s1�� s2�� �����ϴ�.");

		} else {
			System.out.println("���� �ʽ��ϴ�.");

			System.out.println();

		}
			String s3 = new String("TEST");
			String s4 = new String("TEST");

			if (s3 == s4) {
				System.out.println("s1�� s2�� �����ϴ�.");

			} else {
				System.out.println("���� �ʽ��ϴ�.");
			
				if(s3.equals(s4)) {
					System.out.println("s3�� s4�� �����ϴ�.");
				}else {
					System.out.println("���� �ʽ��ϴ�.");
				}
		
				//�Ͻ��� ��ü ������ ����� ��ü������ ������
				//1. (==) �����ڴ� ��ü�� �ּҰ��� ���Ѵ�.
			}	//2. ��ü�� ���� �񱳴� .equals() �޼ҵ带 ����Ѵ�.
			
			//StringBuffer(str)//hello String str = "hello"16 21
	}

}
