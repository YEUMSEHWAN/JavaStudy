package study;
/*
 * ����ڷκ��� �ϳ��� ���ڸ� �Է¹��� ����, �� ����ŭ 3�� ����� ����ϴ� ���α׷� �ۼ�.
 * ���࿡ ����ڷκ��� 5�� �Է¹޾Ҵٸ� 3,6,9,12,15�� ����Ͻÿ�.
 * 
 */
import java.io.*;
public class WhileExam01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num, i=1;
	
		System.out.printf("���ڸ� �Է��� �ּ��� : ");
		num = Integer.parseInt(br.readLine());

		while(i<=num) {
			System.out.print(i * 3+"\t");
			i++;
			
		}
		System.out.println();
		
	}

	}

