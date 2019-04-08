package com.nuedu.demo01;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入矩形的长");
		int x = sca.nextInt();
		System.out.println("请输入矩形的宽");
		int y = sca.nextInt();
		
		Rectangle r = new Rectangle(x,y);
		r.showAll();
		
	}
}
