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
		System.out.println("面积是:"+length*height);
	}
	public void getPer() {
		System.out.println("周长是"+(2*length+2*height));
	}
	public void showAll() {
		System.out.println("长:"+length+"宽"+height+
				"面积"+length*height+"周长"+(2*length+2*height));
	}

	
	
}
