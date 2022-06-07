package com.ysh.arraylist;

import java.util.*;

public class LinkedListEx {

	private static final String colors1[] = { "����", "���", "���", "�Ķ�", "��Ȳ", "����" };
	private static final String colors2[] = { "�ʷ�", "����", "���", "����", "����" };

	// ������
	public LinkedListEx() {

		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (String color : colors1) {
			list1.add(color);
		}
		for (String color : colors2) {
			list2.add(color);
		}

		list1.addAll(list2);

		printList(list1);

		removeItems(list1, 4, 7);// index 4~7 ������ ����

		printList(list1);
		// printList(list2); //list1.addAll ����ϸ� list1���� ����ص� ����.
		printReverseList(list1);
	}

	// �ڷ� ����
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	// ���� ���

	private static void printReverseList(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());

		while (it.hasPrevious())
			System.out.printf("%s\t", it.previous());
	}

	// �ڷ� ��� �޼ҵ�
	public void printList(List<String> list) {
		for (String color : list) {
			System.out.printf("%s\t", color);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListEx le = new LinkedListEx();

	}

}
