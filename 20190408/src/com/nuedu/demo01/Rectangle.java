package com.nuedu.demo01;

public class Rectangle {

	int length;
	int height;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}
	
	public void getArea() {
		System.out.println("�����:"+length*height);
	}
	public void getPer() {
		System.out.println("�ܳ���"+(2*length+2*height));
	}
	public void showAll() {
		System.out.println("��:"+length+"��"+height+
				"���"+length*height+"�ܳ�"+(2*length+2*height));
	}

	
	
}
