package com.neuedu.work06;

public class Student {
	int no;
    String name;
    char sex;
    int age;
    double score;
    
	public Student(int no, String name, char sex, int age, double score) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
    
    public void showAll() {
    	System.out.println("学号:"+this.no+" 姓名:"+this.name+" 性别:"+this.sex+" 年龄:"+this.age+" 综合成绩:"+this.score);
    }
}
