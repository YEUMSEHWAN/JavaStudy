package ArrayTest;

/*
 * 문]
 * 키보드로 돈의 액수를 입력받아 오만원권,만원권,천원권,오백원동전,백원동전,오십원동전,십원동전,일원동전 으로 변환하는 프로그램을 작성.
 * 단,배열과 반복문을 활용
 * 	 
 * 	 
 *   배열명 : unit
 *   금 액 : 65123
 *   
 */
import java.util.*;

public class ArrayTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.printf("금액 : ");
		int money = sc.nextInt();

		int a;
		for (int i = 0; i < unit.length; i++) {
			a = money / unit[i];
			System.out.println();
			System.out.printf("%d원은 " + a + "개", unit[i]);

		}
	}
}
