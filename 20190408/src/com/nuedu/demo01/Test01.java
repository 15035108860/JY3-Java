package com.nuedu.demo01;

public class Test01 {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.name = "�ҵĵ�һ��java��";
		book.page =1000;
		book.price = 108.8;
		book.author ="jack";
		book.type = "IT";
		book.press = "�����";
		
		book.see();
		book.collection();
		book.buyBook();
	}

	
}
 class Book {
	String name;
	int page;
	double price;
	String author;
	int isdn;
	String type;
	String press;
	
	public void see() {
		System.out.println("�����Ȿ��");
	};
	
	public void collection() {
		System.out.println("�Ȿ�鲻��,�ղ�");
	}
	
	public void buyBook() {
		System.out.println(price*5);  
	}
}

