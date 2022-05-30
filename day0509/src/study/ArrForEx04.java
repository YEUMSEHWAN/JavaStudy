package study;
import java.util.*;
/*
 * 100개의 배열 aa를 0,2,4,8,...(2의 배수)로 초기화한 다음,
 * 배열 bb에 역순으로 넣기.
 */
public class ArrForEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 aa,bb를 선언
		int []aa = new int[100];
		int bb[] = new int [100];
		
		int i;
		//배열 aa[0],aa[2],...aa[99]에 
		//0,2,4,..,198 을 대입/
		for (i=0;i<100;i++) {
			aa[i] = i*2;	
		}
		//배열 bb[0]에 aa[99] 를 대입하는 방식으로 값을 역순으로 대입한다.
		for (i=0;i<100;i++) {
			bb[i] = aa[99-i];
		}
		System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨.",bb[0],bb[99]);
		
		
	}
	

}
