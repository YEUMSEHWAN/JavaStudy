package study;

/*
 * �������� ���
 * 1.�ִ� ��, 2.������ �հ�, 3.����, 4.����
 */

import java.io.*;

public class MethodEx02 {
//�ִ밪 ���ϴ� �޼ҵ� �ۼ�
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ù��° ���� �Է�");
		int a = Integer.parseInt(br.readLine());
		System.out.println("�ι�° ���� �Է�");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		} else {
			return b;
		} // end aaa
	}

	// �� �� ������ �հ踦 ���ϴ� �޼ҵ�
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("ù��° ���� �Է�");
		int a = Integer.parseInt(br.readLine());
		System.out.println("�ι�° ���� �Է�");
		int b = Integer.parseInt(br.readLine());

		// ���� ���� ����
		int total = 0;
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		for (int i = a; i <= b; i++) {
			total += i;
		}

		System.out.println(a + "~~~" + b + "������ �հ� : " + total);
		return;

	}// end bbb

	//ū ������� �����ϴ� ������ �����ϴ� �޼ҵ�
	public static String ccc(int x,int y,int z) {//firstSu = x, secondSu = y, thirdSu = z
		if(y>=x&&y>=z) {
			//swap ���Ŀ� �ǰ��ؼ� 
			int temp = x;
			x = y;
			y = temp;
			
		}else if (z>=x&&z>=y) {
			int temp = x;
			x = z;
			z = temp;
			
			
			
		}if (z>=y) {
			int temp = y;
			y = z;
			z = temp;
			
			
		}
	String abc = x+">="+y+">="+z;
	return abc;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;// �޴��� �Է� ���� ����

		while (true) {
			System.out.print("1 : �ִ� ��, 2 : ������ �հ�, 3 : ����, 4 : ����");// �ȳ��޼���
			x = Integer.parseInt(br.readLine());

			if (x == 1) {// return���� ���´�.
				int k = aaa();
				System.out.println("�� �� �� �ִ� ���� " + k + "�Դϴ�");
			} else if (x == 2) {// Call by Name
				bbb();
			} else if (x == 3) {//Call by Value
				System.out.println("ù��° �� �Է� : ");
				int firstSu = Integer.parseInt(br.readLine());
				System.out.println("�ι�° �� �Է� : ");
				int secondSu = Integer.parseInt(br.readLine());
				System.out.println("����° �� �Է� : ");
				int thirdSu = Integer.parseInt(br.readLine());
				
				String str = ccc(firstSu,secondSu,thirdSu);
				System.out.println("ū ������ ������ " + str);
			
				
				
				
			} else if (x == 4) {
				break;
			} else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			System.out.println();
		}
		System.out.println("���� �ϼ̽��ϴ�!");
	}
}
