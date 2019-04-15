package com.neuedu.javabean;

public class Circle extends Shap{
	private int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public double getArea() {
		System.out.print("圆的面积是:");
		return Math.PI*r*r;
	}
	
	@Override
	public boolean Contain(Point p) {
		if(r*r > p.x*p.y) {
			return false;
		}else {
			return true;
		}
		
	}
	
}
