package ArrayTest;

/*
 *문]
 *양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수중에서3의 배수만을 출력하는 프로그램을 작성하시오.
 */
import java.util.*;

public class ArrayTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf((i+1)+"첫번째 양의 정수 : ");
			arr[i] = sc.nextInt();
			
			
		}
		System.out.println();
		System.out.println("3의 배수");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0)
				System.out.println(arr[i]+ "  ");
				
			}
					
	}
}
