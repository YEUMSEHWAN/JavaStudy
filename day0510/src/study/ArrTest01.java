package study;

/*
 * ������ ���ڰ� ����ִ� �迭�� ���� �����͵� �� 
 * ¦���� ��Ҹ� ��� ����ϰ�,
 * 3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ͻÿ�.
 * 
 * ������ ���� : 4,7,9,1,3,2,5,6,8
 * 
 * 1.�迭�� ��ü ��� ���
 * 2.¦�� ���
 * 3.3�� ����� ���
 */
import java.util.*;

public class ArrTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aa[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 }; // �迭�� ����� �ʱ�ȭ

		for (int i = 0; i < 9; i++) {
			System.out.printf("���� �Է� : ");
			aa[i] = sc.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			System.out.printf("%4d", aa[i]);
			System.out.println();
		}
		System.out.println("¦�� ��� : ");
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] % 2 == 0)
				System.out.printf("%4d", aa[i]);
		}
		System.out.println();

		System.out.println("3�ǹ�� ��� : ");
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] % 3 == 0)
				System.out.printf("%4d", aa[i]);
		}
	}

}
