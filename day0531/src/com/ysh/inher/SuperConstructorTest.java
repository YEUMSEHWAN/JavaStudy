package com.ysh.inher;

class sawon2 {

	String name;
	String dept;
	int salary;

	public sawon2(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;

	}

	String displayInfo() {
		return "�̸� : " + name + ",�μ� : " + dept + "���� : " + salary;

	}
}

class salse2 extends sawon2 {

	int commition;

	public salse2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);// �ٸ��������� ���� ȣ���Ҷ��� �׻� ù��!!*****
		this.commition = commition;

	}

	@Override
	String displayInfo() {
		// TODO Auto-generated method stub
		return super.displayInfo() + "����" + commition;
	}
}

public class SuperConstructorTest {

	public static void main(String[] args) {
		salse2 se = new salse2("ȫ�浿", "���ߺ�", 1000000000, 50000000);
		System.out.println(se.displayInfo());
		

	}

}
