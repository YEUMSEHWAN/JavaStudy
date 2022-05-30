package day0428;
import java.util.*;
/*
 * 팩토리얼을 구하는 프로그램을 작성하시오.
 * 사용자로부터 n이라고 하는 수를 입력받아 n!를 계산하여 출력함
 * n! = 1 * 2 * 3 * 4 * 5 * n
 */
public class Test01 {

public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
		int i;
		int n, sum;
		n=sum=0;
		
		System.out.println("정수 입력 : ");
		n = sc.nextInt();
	
		for(i=1; n>=i; i++)
			sum+= i;//(sum = sum*i)
		
		System.out.printf(n+"의 팩토리얼 값은" + sum + "입니다.");
	
	}
		
}
