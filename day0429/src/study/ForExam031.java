package study;

/*
 * Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է� �ް�
 * ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���ĺ� e
 * 
 * abcde
 * abcd
 * abc
 * ab
 * a
 */
import java.util.*;

public class ForExam031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("���ĺ� �Է� : ");
		char e = sc.next().charAt(0);

		for (char i = e; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
				
			}
			System.out.println();

		}

	}

}
