package com.ysh.setex;

import java.util.*;

public class HashTableEx01 {

	private static final String name[] = { "�ö���", "��ũ���׽�", "����", "����", "�Ƹ������ڷ���", "�����" };

	private static final String tel[] = { "111-1111", "222-2222", "333-3333", "555-5555", "666-6666", "777-7777" };

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<>();

		// �ؽ� ���̺� Ű,������ �Է�
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);

			// System.out.println(ht);

			// �ؽ� ���̺��� ��(��ȣ)�� Ű(�̸�)�� �̿��ؼ� �˻�
			String str = ht.get("�����");

			if (str != null) {
				System.out.println("������� ��ȭ��ȣ : " + str);
			}
		}
			//Ű�� �����ϴ��� �˻�
			if(ht.containsKey("�ɽ���")) 
				System.out.println("�ɽ��� �ڷᰡ �����մϴ�.");
			else
				System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
			
			//���� �����ϴ��� �˻�
			if(ht.contains("555-5555")) 
				System.out.println("��ȣ �ڷᰡ �����մϴ�.");
			else
				System.out.println("��ȣ �ڷᰡ �������� �ʽ��ϴ�.");
			
			
			
			//�ڷ� ����
			ht.remove("�����");
			if(ht.containsKey("�����")) 
				System.out.println("�ڷᰡ �����մϴ�.");
			else
				System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
			

	}

}
