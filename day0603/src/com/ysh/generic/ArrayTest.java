package com.ysh.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();

		List<String> list1 = new ArrayList<String>();
		list1.add("�����⵿��");
		list1.add("���ɰ���");

		List<String> list2 = new ArrayList<String>(list1);

		list2.add("��ǻŸ");
		list2.add("ġ����");

		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2);

		int n = list3.indexOf("���ɰ���");
		System.out.println(n);

		list3.add(n + 1, "�ڳ�");// �߰� �ϰ� ������
		System.out.println(list3);

		Iterator<String> it = list3.iterator();

		while (it.hasNext()) {

			System.out.print(it.next() + " ");

		}

	}

}
