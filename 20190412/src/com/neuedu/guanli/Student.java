package com.neuedu.guanli;

public class Student {
	int id;
	String stuName;
	char stuSex;
	short stuAge;
	String stuGrade;
	String stuAdress;
	int stuTel;
	String stuEmai;
	@Override
	public String toString() {
		return "id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAdress=" + stuAdress + ", stuTel=" + 
				stuTel + ", stuEmai=" + stuEmai;
	}
	public Student(int id, String stuName, char stuSex, short stuAge, String stuGrade, String stuAdress, int stuTel,
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
