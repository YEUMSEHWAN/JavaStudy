package study;

/*2. �ݶ� ���̴� ����ƾ ���ڼ��� ���̽� ���Ͻ��� ������ ���Ǳ� ���α׷��� �����Ͻÿ�
*	 ��,0�� �Է��ϸ� ����.
*/
import java.util.*;

public class WhileExam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1;
		String str = "";

		while (true) {
			System.out.println("1: �ݶ� 2: ���̴� 3: ����ƾ �� 4:���ڼ��� 5:���̽� 6:���Ͻ� 0:����");
			n = sc.nextInt();

			switch (n) {

			case 1:
				str = "�ݶ�";
				break;
			case 2:
				str = "���̴�";
				break;
			case 3:
				str = "����ƾ ��";
				break;
			case 4:
				str = "���ڼ���";
				break;
			case 5:
				str = "���̽�";
				break;
			case 6:
				str = "���Ͻ�";
				break;
			case 0:
				break;
			default:
				str = "�����Ͻ� ��ǰ�� �����ϴ�.";
				break;

			}
			if (n == 0) {
				System.out.println(" �����մϴ�. ");
				break;
//			break;
			}else {
				System.out.printf("�����Ͻ� �����" + str + "�Դϴ�.");
				break;
			}
		}

	}
}
