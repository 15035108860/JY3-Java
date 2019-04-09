package com.nuedu.circle;

public class CircleTest {

	public static void main(String[] args) {
		//圆心
		Point p = new Point(0, 0);
		//圆
		Circle circle = new Circle(p, 2);
		//比较的点
		Point comparePoint = new Point(1,0);
		
		System.out.println(circle.getResult(comparePoint) == true ? "在圆内" : "在圆外");
	}
}
