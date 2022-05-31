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
		return "이름 : " + name + ",부서 : " + dept + "연봉 : " + salary;

	}
}

class salse2 extends sawon2 {

	int commition;

	public salse2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);// 다른생성자의 것을 호출할때는 항상 첫줄!!*****
		this.commition = commition;

	}

	@Override
	String displayInfo() {
		// TODO Auto-generated method stub
		return super.displayInfo() + "수당" + commition;
	}
}

public class SuperConstructorTest {

	public static void main(String[] args) {
		salse2 se = new salse2("홍길동", "개발부", 1000000000, 50000000);
		System.out.println(se.displayInfo());
		

	}

}
