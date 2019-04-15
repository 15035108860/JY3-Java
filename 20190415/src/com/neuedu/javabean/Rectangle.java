package com.neuedu.javabean;

public class Rectangle extends Shap{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public double getArea() {
		System.out.print("矩形的面积是:");
		return x*y;
	}
	
	@Override
	public boolean Contain(Point p) {
		if(p.x > 0 && p.x < x & p.y > 0 && p.y < y) {
			return true;
		}else {
			return false;
		}
	}
}
