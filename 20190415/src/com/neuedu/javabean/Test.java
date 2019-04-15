package com.neuedu.javabean;

public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setR(3);
		double area = circle.getArea();
		System.out.println(area);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(3);
		rectangle.setY(4);
		double area2 = rectangle.getArea();
		System.out.println(area2);
		
		Point p = new Point(1,1);
		
		boolean contain = circle.Contain(p);
		System.out.println(contain);
		boolean contain2 = rectangle.Contain(p);
		System.out.println(contain2);
	}
	
	
}
