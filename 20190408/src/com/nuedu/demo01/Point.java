package com.nuedu.demo01;

public class Point {

	int x;
	int y;
	
	public Point() {
		
	}
	public Point(int x0, int y0) {
		x = x0;
		y = y0;
	}
	
	public void movePoint(int dx,int dy) {
		x += dx;
		y += dy;
		System.out.println("移动后: x="+x+",y="+y);
	}
	
	
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 1;
		p1.y = 1;
		System.out.println("p1的坐标是("+p1.x+","+p1.y+")");
		p1.movePoint(7, 7);
		Point p2 = new Point(2, 2);
		System.out.println("p2的坐标是("+p2.x+","+p2.y+")");
		p2.movePoint(2, 2);
	}
}
