package study;

public class ForExam03 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("(%d)", i);
				}else {
					System.out.print(j);	
				}
//				(i==j) ? (i,j):" ";	
			}
			System.out.println();
		}
	}
}
