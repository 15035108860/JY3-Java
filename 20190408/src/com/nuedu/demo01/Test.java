package com.nuedu.demo01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.size = 10;
		v.sleed = 10;
		v.move();
		System.out.println("һ��"+v.size+"ƽ���׵ĳ�,"+"������"+v.sleed+"���ٶ���ʻ");

		Scanner sca = new Scanner(System.in);
		System.out.println("����������ı���ٵ��ٶ� �������� ���ٸ���");
		int changeSleed = sca.nextInt();
		v.setSpeed(changeSleed);
		
	}
}
