package study;
/*
 * 1. -50���� 1������ ���� ����ϴ� ���α׷�
 * ��, ���ٿ� 5������ ����ϰ�, �� ���� �縮�� �� �������� ���ÿ�.
 * 
 * 2. �ݶ� ���̴� ����ƾ ���ڼ��� ���̽� ���Ͻ��� ������ ���Ǳ� ���α׷��� �����Ͻÿ�
 * ��,0�� �Է��ϸ� ����.
 */
public class WhileExam01 {

	public static void main(String[] args) {
		
		int a=-50;
		
		while( a<=1 ) {
			System.out.printf(a+"\t");
			a++;
			
			if(a % 5==0) {
				System.out.println();
			}
			
			
			
		}
		
		
		
	}

}
