package study;

import java.util.*;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] aa = new int[4];// �迭 ����
		int sum = 0, i;// �հ� ������ ÷�ڸ� ����

		for (i = 0; i < 4; i++) { // aa[0] aa[3] �迭�� ���ڸ� �޴´�.
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� : ", i + 1);
			aa[i] = sc.nextInt();

		}
			sum = aa[0] + aa[1] + aa[2] + aa[3];
			System.out.printf("�հ�� %d �Դϴ�.", sum);
	
	}

}
