package study;

/*
 *0����99������ ������ ���� ���� ī�带 ���� �����
 *�� ī�� ���� ���ߴ� ������.
 *ī����� ���� 77�̶�� ���� ���ߴ� ����� 55�� �Է��ϸ�
 *�� ���� �ٽ� 70�� �Է��ϸ� �� ���� ��� ������ ������ �������鼭 
 *������ ���ߴ� ����
 *������ �����ϱ� ���� y/n�� ����, n�� ���� ������
 *
 * ��ǻ�Ͱ� ���� ���� ���Ƿ� �����ϱ� ���� Random Ŭ������ �����
 * Random Ŭ���� ������
 * 1.import java.util.*;
 * 2.Random r = new Random();(main()�޼ҵ� �ȿ� �ۼ�)
 * 				int i = r.nextlnt(100);�� �ǹ̴� 
 * 				0~99������ ������ ������ ������.
 * 
 * String str = sc.next();
 * if(str.equals("n")){
 * system.exit(0);
 * break; 
 */
import java.util.*;

public class Game {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// ��������
		// low,high,card
		int low, high, card;

		// n : (y/n) ���ڿ��� �ԷµǸ� ������ �ݺ����� ���θ� �Ǵ�.
		while (true) {
			int i = 0;// ������� ���� Ƚ��
			low = 0;// ī���� �ּҰ�
			high = 99;// ī���� �ִ밪

			// 0�� 99�� ������ ����(����)���� ������(���谪)
			card = r.nextInt(100);
			System.out.println("������ ���� ���� ������~");

			while (true) {
				System.out.println("�Է��Ҽ� �ִ� ���� ����" + low + "~~" + high + "�Դϴ�.");

				int n = 0;
				n = sc.nextInt();// ���� �Է¹���.

				// �Է��� ���� ������ ��� ���� �������� ��츦 ����
				if (n > high || n < low) {
					System.out.println("�Է¹��� ���� ������ �ʰ��ϼ̽��ϴ�.");
				} else {
					if (n == card) {
						System.out.println("��~�ܿ� �����!��������");
						break;
					}else if(n>card) {//�Էµ� ���� ������ ī�尪���� ū ���
						System.out.printf("�޷�~ �� ������~ : \n");
						high = n;
					}else {//�Էµ� ���� ī�尪���� ���� ���
						System.out.printf("�޷�~ �� ũ����~ : \n");
						low = n;
					}
				}
				i++;//���� Ƚ�� ����
				} // ���� end while
				System.out.printf("���� ��� �ҷ�?(y/n): ");
				if (sc.next().equals("n"))
					break;

			} // �ٱ��� end while
		}

	}
