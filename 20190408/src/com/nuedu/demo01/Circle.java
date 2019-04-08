package com.nuedu.demo01;

import java.awt.Point;
import java.util.Scanner;

public class Circle {
	
	Point p = new Point();
	int r;
	
	
	public Circle() {
		p.x = 0;
		p.y = 0;
		r = 2;
	}

	public Circle(Point p, int r) {
		this.p.x = p.x;
		this.p.y = p.y;
		this.r = r;
	}
 
	public void getArea() {
		System.out.println("请输入圆的半径大小");
		Scanner sca = new Scanner(System.in);
		int r = sca.nextInt();
		double pow = Math.pow(r, 2);
		System.out.println(pow*3.14);
	}
	
	public void getResult(Point p) {
		System.out.println("请输入圆的半径大小");
		Scanner sca = new Scanner(System.in);
		int r = sca.nextInt();
		System.out.println("请输入你查找点的横坐标");
		int x = sca.nextInt();
		System.out.println("请输入你查找点的纵坐标");
		int y = sca.nextInt();
		
		int a = p.x;
		int b = p.y;
		if(a-r <= x && x <= a+r || b-r <= y && y <= b+r) {
			System.out.println("该点在圆内");
		}else {
			System.out.println("该点在圆外");
		}
		
	}
	public static void main(String[] args) {
		
//		  Circle c1 = new Circle(); 
//		  System.out.println(c1.p.x); 
//		  c1.getArea();
		 
		
		Point p = new Point(1,1);
		Circle c2 = new Circle(p, 3);
		System.out.println("c2的起始坐标是:("+p.x+","+p.y+")");
		c2.getResult(p);
	}
}
