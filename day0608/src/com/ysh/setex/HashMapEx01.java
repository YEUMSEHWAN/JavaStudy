package com.ysh.setex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
/*
 * Map<key,value> : Ű���� �ߺ��� ������� ����, ���� �ߺ��� �����
 * 					Ű���� �ߺ��� �� ��� ���� �����ؾ���.
 */

public class HashMapEx01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// Map�� ������ �߰� put(k,v);
		map.put("��ȭ", "���� ��޺� ŰŰ");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");

		System.out.println(map);

		String key;

		Set set = map.keySet();

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}

		map.put("��ȭ", "�޸��� ����");//Ű���� ������ �ȵǰ� ���� ����ȴ�.
		//Ű���� �ߺ����� �ʴ´�.
		System.out.println(map);

	}

}
