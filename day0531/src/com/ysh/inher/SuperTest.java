package com.ysh.inher;

class sawon {
	
	String name;
	String dept;
	int salary;

	String disPlayInfo() {
		return "이름 : " + name + " 부서 : " + dept + " 연봉 : " + salary;
	}

}

class salse extends sawon {

	int commition;

	@Override
	String disPlayInfo() {
		// TODO Auto-generated method stub
		return super.disPlayInfo() + ",수당 : " + commition;
	}

}

public class SuperTest {

	public static void main(String[] args) {
		
		salse s = new salse();
		System.out.println(s.disPlayInfo());
		
		
		
		
		
	}

}
