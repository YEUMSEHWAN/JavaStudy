package study;
/* (if�� ���׿����� �����)
 * 		1
 * 	   212
 * 	  32123
 * 	 4321234
 */
public class ForExam02 {

	public static void main(String[] args) {
		// �����
		// �������� (if�� ���׿����� �����)
		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
