package study;
import java.util.*;
public class ArrayEx00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;//������ �Է� ������ ����.
		int sum;//�հ� ������ ����
		
		//�� ������ ���ڸ� �Է�.
		System.out.printf("1��° ���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ��� : ");
		b = sc.nextInt();		
		System.out.printf("3��° ���ڸ� �Է��ϼ��� : ");
		c = sc.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ��� : ");
		d = sc.nextInt();

		sum = a+b+c+d;//�Է¹��� ���� �հ�
		
		System.out.printf("�հ�� : %d" , sum);//�հ� ���
		
	}

}
