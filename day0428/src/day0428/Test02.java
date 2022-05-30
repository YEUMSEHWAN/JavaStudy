package day0428;
/*
 * 무한대로 두개의 정수를 입력받아 합계를 구하는 프로그램을 작성하시오
*/
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2 = 0;
		int sum = 0;
		System.out.printf("첫번째 정수 : ");
		n1 =sc.nextInt();
		System.out.printf("두번째 정수 : ");
		n2 = sc.nextInt();
		
		//for(;;) {
		while(true) {	
		System.out.println("두 수의 합계" +sum);
			if(n1+n2==0) {
			break;	
			}
			sum = n1+n2;
			System.out.println("사랑해");
		}
		
		
	}

}
