package study;

import java.util.*;

public class ArrForEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aa[] = { 100, 200, 300, 400 };//�迭 ����� ���ÿ� ���� �ʱⰪ�� ����.
		int bb[] = new int[] { 100, 200, 300 };//�迭 ����� ���ÿ� new �����ڿ� �Բ� �ʱⰪ�� ����

		//�迭 ���� �� �ʱⰪ�� ����.
		int cc[];
		cc = new int[] { 100, 200 };
		
		//�迭 ����� ���ÿ� ũ�⸦ ������ �� �ʱⰪ�� �����Ѵ�.
		int[] dd = new int[1];
		dd[0] = 100;
		
		
		int i;

		for (i = 0; i < 4; i++)
			System.out.printf("aa[%d] == %d\t", i, aa[i]);//aa �迭�� ������ŭ �ݺ��ϰ� �迭 aa�� ������ ��� ���.
		System.out.printf("\n");
		for (i = 0; i < 3; i++)
			System.out.printf("bb[%d] == %d\t", i, bb[i]);//bb �迭�� ������ŭ �ݺ��ϰ� �迭 bb�� ������ ��� ���.
		System.out.printf("\n");
		for (i = 0; i < 2; i++)
			System.out.printf("cc[%d] == %d\t", i, cc[i]);//cc �迭�� ������ŭ �ݺ��ϰ� �迭 cc�� ������ ��� ���.
		System.out.printf("\n");
		for (i = 0; i < 1; i++)
			System.out.printf("dd[%d] == %d\t", i, dd[i]);//dd �迭�� ������ŭ �ݺ��ϰ� �迭 dd�� ������ ��� ���.
		System.out.println("\n");
	}
}
