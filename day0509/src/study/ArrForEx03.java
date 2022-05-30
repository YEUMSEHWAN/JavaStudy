package study;

import java.util.*;

public class ArrForEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aa[] = { 100, 200, 300, 400 };//배열 선언과 동시에 직접 초기값을 대입.
		int bb[] = new int[] { 100, 200, 300 };//배열 선언과 동시에 new 연산자와 함께 초기값을 대입

		//배열 선언 후 초기값을 대입.
		int cc[];
		cc = new int[] { 100, 200 };
		
		//배열 선언과 동시에 크기를 결정한 후 초기값을 대입한다.
		int[] dd = new int[1];
		dd[0] = 100;
		
		
		int i;

		for (i = 0; i < 4; i++)
			System.out.printf("aa[%d] == %d\t", i, aa[i]);//aa 배열의 개수만큼 반복하고 배열 aa의 내용을 모두 출력.
		System.out.printf("\n");
		for (i = 0; i < 3; i++)
			System.out.printf("bb[%d] == %d\t", i, bb[i]);//bb 배열의 개수만큼 반복하고 배열 bb의 내용을 모두 출력.
		System.out.printf("\n");
		for (i = 0; i < 2; i++)
			System.out.printf("cc[%d] == %d\t", i, cc[i]);//cc 배열의 개수만큼 반복하고 배열 cc의 내용을 모두 출력.
		System.out.printf("\n");
		for (i = 0; i < 1; i++)
			System.out.printf("dd[%d] == %d\t", i, dd[i]);//dd 배열의 개수만큼 반복하고 배열 dd의 내용을 모두 출력.
		System.out.println("\n");
	}
}
