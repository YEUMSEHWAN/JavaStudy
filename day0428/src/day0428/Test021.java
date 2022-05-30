package day0428;

import java.util.Scanner;

public class Test021 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n1,n2 = 0;
		int sum = 0;
		
		//for(;;) {
		while(true) {	
		System.out.println("첫번째 정수입력 : ");
		n1 =sc.nextInt();
		if(n1==0)
		break;	
		System.out.println("두번째 정수입력 : ");
		n2 = sc.nextInt();
		System.out.println("두 수의 합계는 : " +(n1+n2));
		}
		}
		}
