package ArrayTest;

/*
 * ��]
 * Ű����� ���� �׼��� �Է¹޾� ��������,������,õ����,���������,�������,���ʿ�����,�ʿ�����,�Ͽ����� ���� ��ȯ�ϴ� ���α׷��� �ۼ�.
 * ��,�迭�� �ݺ����� Ȱ��
 * 	 
 * 	 
 *   �迭�� : unit
 *   �� �� : 65123
 *   
 */
import java.util.*;

public class ArrayTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.printf("�ݾ� : ");
		int money = sc.nextInt();

		int a;
		for (int i = 0; i < unit.length; i++) {
			a = money / unit[i];
			System.out.println();
			System.out.printf("%d���� " + a + "��", unit[i]);

		}
	}
}
