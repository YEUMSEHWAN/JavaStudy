package day0428;
/*
 * 입력된 정수의 평균을 구하는 프로그램을 구현하시오.
 * 
 * 1. 제일먼저 입력할 정수의 개수를 사용자로 부터 입력 받는다.
 * 2. 입력받은 수만큼 평균값을 구하며 출력한다.
 * 단, 평균값은 실수로 처리한다.
 */
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,count,sum=0;
		double avg =0;
		
		System.out.printf("입력할 정수의 계수 : ");
		count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			System.out.printf("정수 입력 : ");
			num1=sc.nextInt();
			sum = num1+sum;
			
			
			
		}avg = (double)sum/count;
		System.out.printf("평균값은 : %.2f\n", avg);
		
	}

}
