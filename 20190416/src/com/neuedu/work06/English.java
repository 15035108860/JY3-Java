package com.neuedu.work06;

public class English extends Student{

	public English(int no, String name, char sex, int age, double yanJiang, double qizhong, double qimo) {
		super(no, name, sex, age, (yanJiang*0.5+qizhong*0.25+qimo*0.25));
		// TODO Auto-generated constructor stub
	}

}
