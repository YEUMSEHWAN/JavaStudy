package com.inherex;

class Super {//�θ� Ŭ����
	int a = 5;//�θ� Ŭ������ �ɹ� ����
	
	public Super(int x) {
		System.out.println("�θ�Ŭ���� ������ : "+x);
	
	}
	
	
}

class Sub extends Super{
	
	int a =10;
	
	public Sub() {
		super(5);
		System.out.println("�ڽ� Ŭ������ ������");
	}
	
	
	//�θ�� �ڽ��� ������ ������
	public void test() {
		System.out.println(this.a);//�ڽ��� ���� ȣ��(this)
		System.out.println(super.a);//�θ��� ���� ȣ��(super(�޼ҵ�))
		
		
	}
	
	
}



public class SuperEx {

	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.test();
		
		
	}

}
