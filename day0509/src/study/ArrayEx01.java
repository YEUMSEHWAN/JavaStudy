package study;
import java.util.*;
public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]aa = new int[4];//정수형 배열을 선언
		int sum;
		
		System.out.printf("1번째 숫자를 입력하세요 : ");
		aa[0] = sc.nextInt();//배열 aa[0]에 숫자를 입력
		System.out.printf("2번째 숫자를 입력하세요 : ");
		aa[1] = sc.nextInt();//배열 aa[1]에 숫자를 입력
		System.out.printf("3번째 숫자를 입력하세요 : ");
		aa[2] = sc.nextInt();//배열 aa[2]에 숫자를 입력
		System.out.printf("4번째 숫자를 입력하세요 : ");
		aa[3] = sc.nextInt();//배열 aa[3]에 숫자를 입력
		
		//배열에 저장된 숫자를 합한다.
		sum = aa[0] + aa[1] + aa[2] + aa[3];
		
		
		System.out.printf("합계는 ==> %d\n", sum);
	}

}
