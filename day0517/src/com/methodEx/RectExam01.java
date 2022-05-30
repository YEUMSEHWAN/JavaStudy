package com.methodEx;

/*�簢���� ���̿� �ѷ��� ���.( Ŭ������ ǥ�� )
 * 
 * Ŭ������ �Ӽ� : ����,����(����,�ѷ�,����,����,���� ���)
 * Ŭ������ ���(�޼ҵ�) : ���̰����, �ѷ������, ����/���� �Է±��, ��±��
 * 
 * ��ü�� ���� : ������(�Ӽ��� ���¸� �ǹ�) + ���(����)
 * Ŭ������ ���� : �������  +  �޼ҵ�
 */
import java.util.*;

class Rect {// Ŭ���� ����(����)
	/*
	 * ��� ���� ����
	 * 
	 * ���� ���� : Ŭ���� ��ü(Ŭ���� ��, �޼ҵ� �ȿ���) �ȿ��� Ȱ�� ������ ����(static o) ���� ���� : Ŭ������ �ҼӵǾ� �ִ�
	 * ����(static x) �ν��Ͻ� ���� : �ν��Ͻ��� ���� �ɶ� �� �ǹ���. �� Rect re = new Rect();
	 * 
	 */
//����,���� ��� ���� ����
	int w, h;
	// �޼ҵ� ���� (����/���� �Է�)
	// void : �޼ҵ� ���� �� �޼ҵ带 ȣ���� ���� ����� ������ �ʿ䰡 ������ ����Ѵ�.

	void input() {
		Scanner sc = new Scanner(System.in);// �ν��Ͻ� ����

		System.out.printf("���� �Է� : ");
		w = sc.nextInt();
		System.out.printf("���� �Է� : ");
		h = sc.nextInt();
	}

	// ���� ��� ���(�޼ҵ� ����)

	int area() {
		int result;
		result = w * h;

		return result;
		/*
		 * �޼ҵ�� ����(return)���� ���ؼ��� ����� ����(��ȯ)�ְ� �ȴ�.
		 * 
		 */
	}

	int length() {
		//int result;
		//result = 2 * (w * h);

		//return result;
		return 2 * (w + h);
	}
	
	/*
	 * ��� �޼ҵ� ����
	 * 
	 * �Ű������� ���� �����͸� �Ѱ� ����.(�������� �ʴ� ������)
	 * �޼ҵ��� �Ű� ������ �޼ҵ� �������� Ȱ�� ����.
	 * �Ű����� ����� ������ ���� ���� �ڷ����� ���� �����ؾ��Ѵ�.
	 */
	
	void print(int a, int i) {
		
		System.out.println("���� : " + w+"cm");
		System.out.println("���� : " + h+"cm");
		System.out.println("���� : " + a+"cm2");
		System.out.println("�ѷ� : " + i+"cm");
		
		
		
		
	}
}

public class RectExam01 {

	public static void main(String[] args) {
		
		//1. �ν��Ͻ� ����(������ �޼ҵ� ȣ��)
		Rect r = new Rect();
		
		//�Է� �޼ҵ� ȣ��
		r.input();
		
		//���̿� �ѷ� �޼ҵ� ȣ��
		int a = r.area();//����
		int b = r.length();//�ѷ�
		
		//��� �޼ҵ� ȣ��
		r.print(a, b);
		
		
		
		
	}

}
