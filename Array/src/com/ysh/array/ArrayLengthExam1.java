package com.ysh.array;

public class ArrayLengthExam1 {

	public static void main(String[] args) {
		int[] scores = {87,89,90};
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		
		//length�ʵ�� �б����� �ʵ��̱� ������ ���� �ٲܼ�����.
		//�迭����.length
		double avg = (double) sum/scores.length;
		System.out.println("��� : " + avg);
		
		
		
		
	}

}
