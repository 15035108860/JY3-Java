package com.nuedu.circle;

public class CircleTest {

	public static void main(String[] args) {
		//Բ��
		Point p = new Point(0, 0);
		//Բ
		Circle circle = new Circle(p, 2);
		//�Ƚϵĵ�
		Point comparePoint = new Point(1,0);
		
		System.out.println(circle.getResult(comparePoint) == true ? "��Բ��" : "��Բ��");
	}
}
