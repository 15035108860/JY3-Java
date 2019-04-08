package com.nuedu.demo01;

public class NotBook {

	char colocr;
	String cpu;
	
	public NotBook(char colocr, String cpu) {
		super();
		this.colocr = colocr;
		this.cpu = cpu;
	}
	public NotBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void showAll() {
		System.out.println("笔记本的颜色是:"+colocr);
		System.out.println("笔记本cpu的型号是:"+cpu);
	}
}
