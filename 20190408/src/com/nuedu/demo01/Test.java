package com.nuedu.demo01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.size = 10;
		v.sleed = 10;
		v.move();
		System.out.println("一辆"+v.size+"平方米的车,"+"正在以"+v.sleed+"的速度行驶");

		Scanner sca = new Scanner(System.in);
		System.out.println("请输入你想改变多少的速度 加速正数 减速负数");
		int changeSleed = sca.nextInt();
		v.setSpeed(changeSleed);
		
	}
}
