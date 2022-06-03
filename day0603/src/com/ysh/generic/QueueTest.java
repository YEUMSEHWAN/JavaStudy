package com.ysh.generic;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	private static final String colors[] = { "����", "���", "���", "û��", "����", "����" };

	public static void main(String[] args) {

		Queue<String> qu = new LinkedList<>();

		for (String color : colors) {
			qu.offer(color);

		}
		while (qu.isEmpty()) {

			System.out.println(qu.poll());
		}
	}

}
