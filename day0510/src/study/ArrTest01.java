package study;

/*
 * 임의의 숫자가 들어있는 배열의 숫자 데이터들 중 
 * 짝수인 요소만 골라서 출력하고,
 * 3의 배수인 요소만 골라서 출력하는 프로그램을 구현하시오.
 * 
 * 임의의 숫자 : 4,7,9,1,3,2,5,6,8
 * 
 * 1.배열의 전체 요소 출력
 * 2.짝수 출력
 * 3.3의 배수만 출력
 */
import java.util.*;

public class ArrTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aa[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 }; // 배열의 선언과 초기화

		for (int i = 0; i < 9; i++) {
			System.out.printf("정수 입력 : ");
			aa[i] = sc.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			System.out.printf("%4d", aa[i]);
			System.out.println();
		}
		System.out.println("짝수 출력 : ");
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] % 2 == 0)
				System.out.printf("%4d", aa[i]);
		}
		System.out.println();

		System.out.println("3의배수 출력 : ");
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] % 3 == 0)
				System.out.printf("%4d", aa[i]);
		}
	}

}
