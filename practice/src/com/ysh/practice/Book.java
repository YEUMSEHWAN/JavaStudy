package com.ysh.practice;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book(String title) {//������
		this(title,"���� �̻�");
		
	}
	public Book(String title, String author) {//������
	this.title =title;
	this.author = author;
	}
	
	public static void main(String[] args) {
		//������ Book(String t)ȣ��
		Book loveStory = new Book("������");
		
		//������ Book(String t, String a) ȣ��
		Book littlePrince = new Book("�����", "�������丮");
		
		Book emptyBook = new Book();
		
		littlePrince.show();
		
		
		
	}

}
