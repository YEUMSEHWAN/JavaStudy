package study;
/*
 * 사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램 작성.
 * 만약에 사용자로부터 5를 입력받았다면 3,6,9,12,15를 출력하시오.
 * 
 */
import java.io.*;
public class WhileExam01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, i=1;
	
		System.out.printf("숫자를 입력해 주세요 : ");
		num = Integer.parseInt(br.readLine());

		while(i<=num) {
			System.out.print(i * 3+"\t");
			i++;
			
		}
		System.out.println();
		
	}

	}

