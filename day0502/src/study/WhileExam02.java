package study;
/*
 * while ���� �̿��� �������� ����ÿ�.
 */
public class WhileExam02 {

	public static void main(String[] args) {
		
		int i=2,j;
		
		while(i<=9) {
			j=1;
			while(j<=9) {
				System.out.printf("%d x %d = %d\n",i,j,(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
