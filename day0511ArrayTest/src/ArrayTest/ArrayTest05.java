package ArrayTest;

/*
 * ��]
 * ��ǻ�Ϳ� ����� ������ ���� ���� �� ������ ����.
 * ����ڰ� ���� 3������ �ϳ��� �Է��ϰ� ������.
 * ��ǻ�ʹ� �������� �ϳ��� �����Ͽ� ����ڿ� ��.
 * ���� �̰������ �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ������ ����.
 * 
 * (�ݺ�)
 * ���� ���� �� �Է� : ����
 * ����� : ���� , ��ǻ�� :����, ����ڰ� �̰���ϴ�.
 * 
 * ���� ���� �� �Է�: �׸�
 * ������ ���� �մϴ�.
 * 
 * ���ڿ� �迭 ����
 * String[] str = {"����","����","��"};
 * 
 * ��ǻ�Ͱ� ���°��� �������� �����ϱ� ���ؼ��� 
 * int r=(int)(Math.random()*3);
 * 
 * ��ǻ�Ͱ� ���°��� �������� ��
 * if(str[n].equals("����"));
 */
import java.util.*;

public class ArrayTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		String a;// ����� �Է�
		String[] str = { "����", "����", "��" };

		System.out.printf("���� ���� �� �Է� : ");
		a = sc.next();

		int r = (int) (Math.random() * 3);
		System.out.printf("��ǻ�� : %s", str[r]);

		System.out.println();
		if (a.equals("����")) {
			if (str[r].equals("����")) {
				System.out.println("�����ϴ�.");
			} else if (str[r].equals("����")) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�̰���ϴ�.");
			}
			
		}
		if (a.equals("����")) {
			if (str[r].equals("����")) {
				System.out.println("�����ϴ�.");
			} else if (str[r].equals("����")) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�̰���ϴ�.");
			}
			

		}
		if (a.equals("��")) {
			if (str[r].equals("��")) {
				System.out.println("�����ϴ�.");
			} else if (str[r].equals("����")) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�̰���ϴ�.");
			}
			
			String stop ="�׸�";
			System.out.println("�� ������ �Ͻðڽ��ϱ�?");
			stop = sc.next();
		}
	}
	}
}
