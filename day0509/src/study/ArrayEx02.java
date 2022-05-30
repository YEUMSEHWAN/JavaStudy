package study;

import java.util.*;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] aa = new int[4];// 배열 선언
		int sum = 0, i;// 합계 변수와 첨자를 선언

		for (i = 0; i < 4; i++) { // aa[0] aa[3] 배열의 숫자를 받는다.
			System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
			aa[i] = sc.nextInt();

		}
			sum = aa[0] + aa[1] + aa[2] + aa[3];
			System.out.printf("합계는 %d 입니다.", sum);
	
	}

}
