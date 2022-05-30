package study;
/*
 * 사용자가 입력하는 정수를 계속해서 더해 나아감
 * 만약0이 입력되면 지금까지 입력된 정수의 덧셈결과를 출력하고 종료함.
 * 
 */
import java.io.*;
public class WhileExam02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=1,sum=0;
		
		while(n!=0) {
			
			System.out.println("정수 입력, 0 종료 : ");
			n = Integer.parseInt(br.readLine());
			if(n==0)
				break;
			sum+=n;
		}
			System.out.println("지금까지의 입력된 정수의 합계 : "+sum);
	
	}
	

}
