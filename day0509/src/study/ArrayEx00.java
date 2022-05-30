package study;
import java.util.*;
public class ArrayEx00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;//각각의 입력 변수를 선언.
		int sum;//합계 변수를 선언
		
		//각 변수에 숫자를 입력.
		System.out.printf("1번째 숫자를 입력하세요 : ");
		a = sc.nextInt();
		System.out.printf("2번째 숫자를 입력하세요 : ");
		b = sc.nextInt();		
		System.out.printf("3번째 숫자를 입력하세요 : ");
		c = sc.nextInt();
		System.out.printf("4번째 숫자를 입력하세요 : ");
		d = sc.nextInt();

		sum = a+b+c+d;//입력받은 숫자 합계
		
		System.out.printf("합계는 : %d" , sum);//합계 출력
		
	}

}
