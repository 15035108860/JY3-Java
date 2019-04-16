package com.neuedu.work06;

public class Wenxue extends Student{

	public Wenxue(int no, String name, char sex, int age, double yanjiang, double zuoping, double qimo, double qizhong) {
		super(no, name, sex, age, (yanjiang*0.35+zuoping*0.35+qimo*0.15+qizhong*0.15));
		// TODO Auto-generated constructor stub
	}

	
}
