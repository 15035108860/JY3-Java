package com.nuedu.circle;

public class Circle {

	
	
	public Circle(Point p, int r) {
		
		this.p = p;
		this.r = r;
	}

	Point p;
	int r;
	
	public double getArea(int r) {
		return Math.PI*r*r;
	}
	
	public boolean getResult(Point p) {
		
		boolean result = Math.pow((this.p.x - p.x ),2) + Math.pow((this.p.y - p.x), 2) <= r*r;
		return result;
	}
}

class Point{

	public Point() {
		
	}
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}
