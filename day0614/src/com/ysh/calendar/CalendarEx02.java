package com.ysh.calendar;

import java.util.*;

public class CalendarEx02 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int y, m, i;

		System.out.print("�⵵ : ");
		y = sc.nextInt();

		do {
			System.out.print("�� : ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		cal.set(y, m - 1, 1);

		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("\t" + y + "��" + m + "��");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��  ");
		System.out.println("===========================");
		for (i = 1; i < w; i++) {
			System.out.print("    ");
		}

		for (i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%3d", i);
			w++;
			if (w % 7 == 1) {
				System.out.println();
			}
		}
		if (w % 7 != 1) {
			System.out.println();
		}
		System.out.println("===========================\n");

	}

}