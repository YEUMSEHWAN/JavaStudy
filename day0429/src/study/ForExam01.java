package study;

public class ForExam01 {

	public static void main(String[] args) {
		// ������
		// ���� ����
		int i, j; // i : ��, i: ���ο��� 1~9 �ݺ�ó��
		for (j = 1; j <= 9; j++) { // ��
			for (i = 2; i <= 9; i++) {// ��
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
			System.out.println();

		}
	}
}
