package com.ysh.treemapEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("��ȭ", "������ ��庥��");
		map.put("ȣ��", "������");
		map.put("��ȭ", "���˵���2");
		map.put("��ȭ", "����");
		map.put("TV", "���׸�");

		System.out.println(map);

		Map<String, String> subMap = map.subMap("TV", "��ȭ"); // ������ ������ �������.
		System.out.println(subMap); // ���ĵ� �������� ���.

		/*
		 * TreeMap Ŭ������ ��Ʈ(����)�� ���·� �ڷᰡ �߰��ȴ�.
		 * TreeMap Ŭ������ SortedMap<K,V> subMap( K formKey, K tokey)�޼ҵ�
		 * formKey : Ű�� ������, toKey : Ű�� �������� ����.
		 * Ű ������ �κ������� �����Ͽ� ������
		 */
		
		
		
	}

}
