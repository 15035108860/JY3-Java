package com.nuedu.demo01;

public class Vehicle {

	double sleed;
	double size;
	
	public void move() {
		System.out.println("车正在移动");
	}
	
	public void setSpeed(int i) {
		if(i > 0) {
			System.out.println("汽车的速度增加了"+i+"迈,现在速度是"+(sleed+i)+"迈");
		}else {
			System.out.println("汽车的速度减少了"+i+"迈,现在速度是"+(sleed+i)+"迈");
		}
	}
}
