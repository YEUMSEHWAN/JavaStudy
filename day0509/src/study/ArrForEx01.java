package study;

import java.util.*;

public class ArrForEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] aa = new int[5];
		int sum = 0, i;

		for (i = 0; i < 5; i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i + 1);
			aa[i] = sc.nextInt();
		}
		sum = aa[0] + aa[1] + aa[2] + aa[3] + aa[4];

		System.out.printf("�հ�� : %d", sum);

	}

}
