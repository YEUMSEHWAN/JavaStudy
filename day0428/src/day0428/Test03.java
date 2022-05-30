package day0428;
/*
 * 사용자로 부터 임의의 정수를 입력받아
 * 1부터 입력받은 수까지의 전체의 합계, 짝수의 합계, 홀수의 합을 각각 출력하는 프로그램을 구현하고 10단위로 합계를 출력하시오
 * 1~10
 * 1~20
 * 1~30
 */
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, total, odd, even;
		n =total = odd = even =0;
		int i=0;
		System.out.printf("첫번째 정수 : ");
		n =sc.nextInt();
		
		for(i=1; i<=n; i++) { 
			
			if(i%2==0)
				even +=i;
			else
				odd +=i;
			total=total +i;
			if(i==n) {
				System.out.println("1~"+n+"까지의 전체의 합 : "+total);
				System.out.println("1~"+n+"까지의 짝수의 합 : "+even);
				System.out.println("1~"+n+"까지의 홀수의 합 : "+odd);
			}	
			else if(i%10==0){
				System.out.println("1~"+i+"까지의 전체의 합 : "+ total);
				System.out.println("1~"+i+"까지의 짝수의 합 : "+ even);
				System.out.println("1~"+i+"까지의 홀수의 합 : "+ odd);
				System.out.println();
				
			}
		}
		
	}

}
