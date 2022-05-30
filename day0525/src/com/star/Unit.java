package com.star;

public abstract class Unit {// 추상클래스 : 공통적인 기능만 모아서 만듬.

	int x, y;// x:가로축, y:세로축

	abstract void move(int x, int y);

	abstract void stop();

	abstract void message();

}
