package study;

/*
 * �޼ҵ� �����ε�
 * 
 * -������(�ϳ���) Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ���� �� ���ǵǴ� ���� �ǹ���
 * -���� �̸��� �޼ҵ忡 ����(�ŰԺ���)�� �ٸ� ���
 * -���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, ������ �ڷ����� �ٸ��ų�, ������ ���� �ٸ����� �ǹ���
 * -���� �������� ����� ������ �����ϴ� �޼ҵ� ���� ��� �̸��� ���� ����� �ϰ����� �����ϱ� ����
 *
 * ���� ������		��ȯ��		�޼ҵ��(�ڷ��� ����, �ڷ�������, ...)
 * 		1. ���������ڿ� ��ȯ���� ��� ����.
 * 		2. �޼ҵ��� �̸��� �ݵ��* ���ƾ� �Ѵ�.(����)
 * 		3. �ڷ����̳� ������ ������ �ݵ�� �ٸ��� �ؾ���
 *
 */
public class OverloadingEx01 {

	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.printf("�Է��� ���� ���� : " + s.length());
	}	
	public void floatLength(float a) {
		String s = String.valueOf(a);
		System.out.printf("�Է��� ���� ���� : " + s.length());
	}
	public void stringLength(String str) {
		String s = String.valueOf(str);
		System.out.printf("�Է��� ���� ���� : " + str.length());
	}
	
	public static void main(String[] args) {
		
		OverloadingEx01 oe1 = new OverloadingEx01();
		oe1.intLength(1000);//int ��
		oe1.floatLength(3.14f);
		oe1.stringLength("10000");
		
		
	}

}
