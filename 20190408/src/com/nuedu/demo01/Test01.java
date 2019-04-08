package com.nuedu.demo01;

public class Test01 {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.name = "我的第一本java书";
		book.page =1000;
		book.price = 108.8;
		book.author ="jack";
		book.type = "IT";
		book.press = "东软睿道";
		
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
		System.out.println("看看这本书");
	};
	
	public void collection() {
		System.out.println("这本书不错,收藏");
	}
	
	public void buyBook() {
		System.out.println(price*5);  
	}
}

