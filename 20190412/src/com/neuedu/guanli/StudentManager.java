package com.neuedu.guanli;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	//StudentClient sc = new StudentClient();
	StudentClient sc;
	
	
	public StudentManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentManager(StudentClient sc) {
		this.sc = sc;
	}
	
	//创建存放学生信息的数组
	static Student[] stus = new Student[0];
	//创建删除后的数组
	static Student[] newStus;
	
	
	//添加学生
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length+1);
		stus[stus.length-1] = student;
	}
	
	//添加学生界面
	public void addStuPage(Scanner scanner) {
		System.out.println("请输入学生ID");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名");
		String name = scanner.next();
		System.out.println("请输入学生性别");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄");
		Short age = scanner.nextShort();
		System.out.println("请输入学生年级");
		String grade = scanner.next();
		System.out.println("请输入学生地址");
		String addres = scanner.next();
		System.out.println("请输入学生电话");
		int tel = scanner.nextInt();
		System.out.println("请输入学生邮箱");
		String email = scanner.next();
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student(id, name, sex, age, grade, addres, tel, email);
		studentManager.addStudent(student);
		System.out.println("保存成功,返回上级目录");
		
		sc.stuManagerIndex();
	}
	
	
	//根据ID删除学生
	public Student[] delStudentByStuId(int stuId) {
		newStus = new Student[stus.length-1];
		int j = 0;
		for(int i = 0; i < stus.length; i++) {
			
			if(stuId != stus[i].id) {
				newStus[j] = stus[i];
				j++;
			}
		}
		return newStus;
	}
	
	//根据ID修改学生的全部信息
	public void updateStudentInfo(Student student) {
		for(int i = 0; i < stus.length; i++) {
			if(stus[i].id == student.id) {
				
				stus[i] = student;
			}
		}
	}
	

}
