package com.inter.ex;

public class InterfaceEx implements InterEx {

	public static void main(String[] args) {

		InterfaceEx ie = new InterfaceEx();
		System.out.println("getA() : "+ie.getA());
		
	
	}

	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}

}
