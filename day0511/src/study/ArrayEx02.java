package study;
//Arrays.toString()

//toString() = �迭�� ��� ���[ù��°���,~]�� ���� ������ ���ڿ� �������� ���� ��ȯ��

import java.util.*;

public class ArrayEx02 {
	// �� Ŭ������ �迭�� 6��.(int,char,main)

	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 };
		int[] iArr4 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };

		// iArr �� �迭�� 1~10���� ������� ������.
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < iArr2.length; i++) {

			iArr2[i] = (int) (Math.random() * 10) + 1;// random �� int ���� �ƴ� double���̶� ��������ȯ �ʿ�*
			System.out.print(iArr2[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < iArr3.length; i++) {
			System.out.print(iArr3[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < iArr4.length; i++) {
			System.out.print(iArr4[i] + "\t");
		}
		System.out.println();
		
		System.out.print(Arrays.toString(iArr2));
		System.out.print(chArr);
	}
}
