package com.ysh.array;

/*
 * �Ű������� int[] �迭�� ����� add()�޼ҵ尡 ���� ���, �� ������� �迭�� �����԰� ���ÿ�
 * add()�޼ҵ��� �Ű������� ����ϰ��� �Ҷ��� �ݵ�� new�����ڸ� ����ؾ� �Ѵ�.
 * 
 * 
 */
public class ArrayCreateExample2 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 88, 90 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);

		int sum2 = add(new int[] { 83, 88, 90 });// ���ϵ� �� ���� sum2�� ����
		System.out.println("���� : " + sum2);
		System.out.println();

	}
	public static int add(int[]scores) {
		int sum = 0;
		for(int i = 0;i<3;i++) {
			sum += scores[i];
		}
		return sum;
	}

}
