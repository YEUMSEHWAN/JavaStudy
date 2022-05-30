package study;
/*
 * 사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
 * 입력받은 수중에서 가장 큰 수를 출력하는 프로그램 작성.
 * 
 * 단, 배열을 이용하여 구현하시오.
 * 
 * 입력할 데이터 개수 : 9개
 * 데이터 입력 : 4,7,9,1,3,2,5,6,8
 * 가장 큰 수  : 9
 */
import java.util.*;
public class ArrayEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;//입력 받을때 사용할 변수.(데이터의 개수)
		System.out.printf("입력할 데이터의 개수 : ");
		n = sc.nextInt();
		
		//입력받은 정수로 크시를 지정함.
		int aa[] = new int [n];
		System.out.printf("데이터 입력[공백 구분] : ");
		for(int i = 0; i<aa.length;i++) {
			//배열에 입력받은 데이터 지정
			aa[i] = sc.nextInt();	
		}
		
		int max = 0;//가장 큰 수를 저장
		for(int i = 0; i<aa.length;i++) {
			//max 보다 큰 값 골라내기
			if(aa[i]>max)
				max = aa[i];
			
			
	}
		System.out.printf("가장 큰 수는 : " + max);
	}
}
