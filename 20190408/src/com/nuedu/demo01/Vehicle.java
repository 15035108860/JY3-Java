package com.nuedu.demo01;

public class Vehicle {

	double sleed;
	double size;
	
	public void move() {
		System.out.println("�������ƶ�");
	}
	
	public void setSpeed(int i) {
		if(i > 0) {
			System.out.println("�������ٶ�������"+i+"��,�����ٶ���"+(sleed+i)+"��");
		}else {
			System.out.println("�������ٶȼ�����"+i+"��,�����ٶ���"+(sleed+i)+"��");
		}
	}
}
