package com.ysh.sortex;

import java.util.*;

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;

			return c1.compareTo(o2) * -1;// -1을 곱해서 기본 정렬방식을 역으로 변경함.

		}
		return -1;// 0일때는 같다,1일때는 오름차순
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		// Descending d = new Descending();
		String[] strArr = { "Cat", "Dog", "Lion", "Tiger" };

		// 오름차순 정렬
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));

		// 대소문자 구분 없이.
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr : " + Arrays.toString(strArr));

		// 내림차순 정렬
		Descending d = new Descending();
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));
	}

}