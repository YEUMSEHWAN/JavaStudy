package ArrayTest;

//����������1
import java.util.*;

public class ArrayTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] com = { "����", "����", "��" };
		// ���� ���� �� ���ڿ��� ������ �迭

		System.out.println("��ǻ�Ϳ� ���������� ������ �����մϴ�.");
		while (true) {
			System.out.println("���� ���� �� : ");
			String a = sc.next();
			if (a.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;// �ݺ����� Ż�� ���α׷��� ����
			}
			// ��ǻ�Ͱ� ���� ���� �� ���� �������� ����.
			int n = (int) (Math.random() * 3);
			// 0 1 2 �߿��� ������ ������ ����
			String b = com[n];

			System.out.println("����� : " + a + "\n��ǻ�� : " + b);

			// ����ڰ� "����"�� ���

			if (a.equals("����")) {
				
				if(b.equals("����")) {
					System.out.println("�����ϴ�.");
					
				}else if(b.equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�..");
				}else {
					
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				
			//����ڰ� "��"�� ���
			}else if(a.equals("��")) {
				
				if(b.equals("����")) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			
				}else if(b.equals("����")) {
				System.out.println("����ڰ� �̰���ϴ�.");
				}else {
					
					System.out.println("�����ϴ�.");
				}
				
			//����ڰ� "����"�� ���
			}else if(a.equals("����")) {
				
				if(b.equals("����")) {
					System.out.println("����ڰ� �̰���ϴ�.");
					
				}else if(b.equals("����")) {
					System.out.println("�����ϴ�.");
				}else {
				
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
				
			}
			
		}
	}
}
