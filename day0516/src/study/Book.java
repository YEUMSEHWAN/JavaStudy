package study;

public class Book {//클래스 헤더(클래스 명)
	
	//맴버 필드(변수,상수),속성
	
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//생성자
	public Book() {
	this.name = name;
	this.writer = writer;
	this.price = price;
	this.nowPage = nowPage;
	this.isbn = isbn;
	}

	//메소드(동작,행위)
	public void nextPage() { nowPage++;}
	public void previousPage() {nowPage--;}
}


