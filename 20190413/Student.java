package com.neuedu.guanli;

public class Student {
	int id;
	String stuName;
	char stuSex;
	String stuAge;
	String stuGrade;
	String stuAdress;
	String stuTel;
	String stuEmai;
	@Override
	public String toString() {
		return "|" + id + "|\t" + stuName + "|\t" + stuAge+"|\t" + stuSex + 
				 "|\t" + stuGrade + "|\t" + 
				stuTel + "|\t" + stuEmai +"|\t" +stuAdress ;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String stuName, char stuSex, String stuAge, String stuGrade, String stuAdress, String stuTel,
			String stuEmai) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuGrade = stuGrade;
		this.stuAdress = stuAdress;
		this.stuTel = stuTel;
		this.stuEmai = stuEmai;
	}
	
	
}
