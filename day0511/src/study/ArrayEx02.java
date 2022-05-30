package study;
//Arrays.toString()

//toString() = 배열의 모든 요소[첫번째요소,~]와 같은 형식을 문자열 형식으로 만들어서 반환함

import java.util.*;

public class ArrayEx02 {
	// 이 클래스의 배열은 6개.(int,char,main)

	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 };
		int[] iArr4 = { 100, 95, 80, 70, 60 };
		char[] chArr = { 'a', 'b', 'c', 'd' };

		// iArr 의 배열에 1~10까지 순서대로 저장함.
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < iArr2.length; i++) {

			iArr2[i] = (int) (Math.random() * 10) + 1;// random 은 int 형이 아닌 double형이라서 강제형변환 필요*
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
