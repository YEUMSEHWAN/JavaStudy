package study;
/*
 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ���ư�
 * ����0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ��������� ����ϰ� ������.
 * 
 */
import java.io.*;
public class WhileExam02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=1,sum=0;
		
		while(n!=0) {
			
			System.out.println("���� �Է�, 0 ���� : ");
			n = Integer.parseInt(br.readLine());
			if(n==0)
				break;
			sum+=n;
		}
			System.out.println("���ݱ����� �Էµ� ������ �հ� : "+sum);
	
	}
	

}
