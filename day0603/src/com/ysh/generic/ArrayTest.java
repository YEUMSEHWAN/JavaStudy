package com.ysh.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList<Card>();

		List<String> list1 = new ArrayList<String>();
		list1.add("공각기동대");
		list1.add("원령공주");

		List<String> list2 = new ArrayList<String>(list1);

		list2.add("라퓨타");
		list2.add("치히로");

		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2);

		int n = list3.indexOf("원령공주");
		System.out.println(n);

		list3.add(n + 1, "코난");// 추가 하고 싶을때
		System.out.println(list3);

		Iterator<String> it = list3.iterator();

		while (it.hasNext()) {

			System.out.print(it.next() + " ");

		}

	}

}
