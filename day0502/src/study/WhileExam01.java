package study;
/*��]
 *  ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
 *  ���࿡ 0�� �Է��Ǹ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� �����ϴ� ���α׷��� �����Ͻÿ�.
 *  ��, while���� �̿�
 *  
 */

import java.util.*;

public class WhileExam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n=1, sum=0;
		
		while(n!=0) {
			
			System.out.printf("���� �Է�(0:����):" );
			n = sc.nextInt();
			//if(n==0)
				//break;
				sum+= n;
			}
		System.out.println("���ݱ����� �հ� : " + sum);
	}
}
