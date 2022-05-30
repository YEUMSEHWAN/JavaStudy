package com.star;

public class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Take it slow. Dropship ==> x:" + x + " y : " + y);

	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("In the bye, bye, bye, bye");
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message :: Can I take order..");
	}

}
