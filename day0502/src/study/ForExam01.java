package study;
/*��]
 *  1~100������ ���� �߿��� 2,3,5,7 �� ����� ������ ���� �� �࿡
 * 	10���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class ForExam01 {

	public static void main(String[] args) {
		int i, cnt;
			cnt=1;
		for(i=1; i<=100; i++) {
			if((i % 2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0))	
				System.out.printf("%3d%c",i, (cnt++ % 7!=0)? ' ' : '\n');
				
				
				
			}
		System.out.println();
		
		}
		
	}


