package com.ysh.sortex;

import java.util.*;

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;

			return c1.compareTo(o2) * -1;// -1�� ���ؼ� �⺻ ���Ĺ���� ������ ������.

		}
		return -1;// 0�϶��� ����,1�϶��� ��������
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		// Descending d = new Descending();
		String[] strArr = { "Cat", "Dog", "Lion", "Tiger" };

		// �������� ����
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));

		// ��ҹ��� ���� ����.
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr : " + Arrays.toString(strArr));

		// �������� ����
		Descending d = new Descending();
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));
	}

}