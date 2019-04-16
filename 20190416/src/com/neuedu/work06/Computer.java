package com.neuedu.work06;

public class Computer extends Student{

	public Computer(int no, String name, char sex, int age, double english, double caozuo,double qizhong,double qimo) {
		super(no, name, sex, age, (caozuo*0.4+english*0.2+qizhong*0.2+qimo*0.2));
		// TODO Auto-generated constructor stub
	}

}
