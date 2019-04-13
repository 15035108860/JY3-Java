package com.neuedu.guanli;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	//StudentClient sc = new StudentClient();
	//声明StudentClient对象,在调用StudentClient中方法的时候调用
	StudentClient sc;
	Scanner scanner2 = new Scanner(System.in);
	
	public StudentManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//创建参数是StudentClient类型的构造器,防止两边互相调用造成栈溢出
	public StudentManager(StudentClient sc) {
		this.sc = sc;
	}
	
	//创建存放学生信息的数组
	static Student[] stus = new Student[0];
	//创建删除后的数组
	static Student[] newStus;
	
	
	//添加学生方法
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
		String age = scanner.next();
		System.out.println("请输入学生年级");
		String grade = scanner.next();
		System.out.println("请输入学生地址");
		String addres = scanner.next();
		System.out.println("请输入学生电话");
		String tel = scanner.next();
		System.out.println("请输入学生邮箱");
		String email = scanner.next();
		
		Student student = new Student(id, name, sex, age, grade, addres, tel, email);
		StudentManager studentManager = new StudentManager();		
		studentManager.addStudent(student);
		System.out.println("保存成功,返回上级目录");
		
		//返回主界面
		sc.stuManagerIndex();
	}
	
	//删除学生界面
	public void delectStudentPage(Scanner scanner) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.删除所有学生信息  2.根据id删除学生信息  3.返回上一层 ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择菜单:");
		int nextInt = scanner.nextInt();
		
		switch (nextInt) {
		case 1:
			stuManageShow();
			Student[] delAllStudent = delAllStudent();
			System.out.println(Arrays.toString(delAllStudent));
			System.out.println("-----------------------------------------------------------");
			System.out.println("数据删除完毕,系统自动返回目录......");
			delectStudentPage(scanner2);
			break;
		//根据id删除
		case 2:
			System.out.println("请输入要删除的id:");
			int delectid = scanner.nextInt();
			if(delectid < stus.length) {
				stuManageShow();
				Student[] delStudentByStuId = delStudentByStuId(delectid);
				System.out.println(Arrays.toString(delStudentByStuId));
				System.out.println("-----------------------------------------------------------");
				System.out.println("数据删除完毕,系统自动返回目录......");
				delectStudentPage(scanner2);
			}else {
				System.out.println("输入错误,自动返回上一层");
				delectStudentPage(scanner2);
			}
			
			break;
		case 3:
			sc.stuManagerIndex();
			break;
		default:
			System.out.println("输入有误,请重新输入");
			delectStudentPage(scanner2);
			break;
		}
	}
	
	//删除全部学生
	public Student[] delAllStudent() {
		newStus = null;
		return newStus;
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
	
	//修改学生界面
	public void alterStudentPage(Scanner scanner) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.根据id修改学生全部信息  2.根据id修改学生部分信息  3.返回上一层   4.系统退出+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择菜单:");
		int nextInt = scanner.nextInt();
		
		switch (nextInt) {
		//修改全部
		case 1:
			System.out.println("请输入要修改学生的id:");
			int id = scanner.nextInt();
			System.out.println("请输入修改后学生姓名");
			String name = scanner.next();
			System.out.println("请输入修改后学生性别");
			char sex = scanner.next().charAt(0);
			System.out.println("请输入修改后学生年龄");
			String age = scanner.next();
			System.out.println("请输入修改后学生年级");
			String grade = scanner.next();
			System.out.println("请输入修改后学生地址");
			String addres = scanner.next();
			System.out.println("请输入修改后学生电话");
			String tel = scanner.next();
			System.out.println("请输入修改后学生邮箱");
			String email = scanner.next();
			Student newStudent = new Student(id, name, sex, age, grade, addres, tel, email);
			
			updateStudentInfo(newStudent);
			System.out.println("数据修改完毕,系统自动返回目录......");
			alterStudentPage(scanner2);
			
			break;
			
		//修改部分
		case 2:
			System.out.println("请输入要修改学生的id:");
			int nextInt2 = scanner.nextInt();
			System.out.println("请输入要修改的属性(只能输入一个)");
			String next = scanner.next();
			System.out.println("请输入修改后的数据");
			String next2 = scanner.next();
			
			updateStudentInfo1(nextInt2, next, next2);
			System.out.println("数据修改完毕,系统自动返回目录......");
			alterStudentPage(scanner2);
			
			break;
		case 3:
			sc.stuManagerIndex();
			break;
		case 4:
			System.out.println("已退出");
			sc.exitSystem();
			break;

		default:
			System.out.println("输入有误,请重新输入");
			alterStudentPage(scanner2);
			break;
		}
	}
	
	//根据ID修改学生的全部信息
	public void updateStudentInfo(Student student) {
		for(int i = 0; i < stus.length; i++) {
			if(stus[i].id == student.id) {
				
				stus[i] = student;
			}
		}
	}
	
	//根据ID修改学生的部分信息
		public void updateStudentInfo1(int id, String shuxing, String xiugai) {
			for(int i = 0; i < stus.length; i++) {
				if(id == stus[i].id) {
					if(shuxing.equals("年龄")) {
						stus[i].stuAge = xiugai;
					}else if(shuxing.equals("姓名")) {
						stus[i].stuName = xiugai;
					}else if(shuxing.equals("地址")) {
						stus[i].stuAdress = xiugai;
					}else if(shuxing.equals("邮箱")) {
						stus[i].stuEmai = xiugai;
					}else if(shuxing.equals("年级")) {
						stus[i].stuGrade = xiugai;
					}
					
				}
			}
		}
	
	//查看学生界面
	public void checkStudentPage(Scanner scanner) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.查看所有学生信息  2.根据id查询学生信息  3.根据id查询学生姓名  4返回上一层 ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择菜单:");
		int nextInt = scanner.nextInt();
		
		
		switch (nextInt) {
		//查看所有学生信息
		case 1:
			stuManageShow();
			System.out.println(Arrays.toString(stus));
			System.out.println("-----------------------------------------------------------");
			System.out.println("数据查询完毕,系统自动返回目录......");			
			checkStudentPage(scanner2);
			break;
		//根据id查询学生信息
		case 2:
			System.out.println("请输入要查询的id:");
			int checkid = scanner.nextInt();
			stuManageShow();
			checkStudentById(checkid);
			System.out.println("-----------------------------------------------------------");
			System.out.println("数据查询完毕,系统自动返回目录......");
			checkStudentPage(scanner2);
			break;
			//根据id查询学生姓名	
		case 3:
			System.out.println("请输入要查询的id:");
			int checkid2 = scanner.nextInt();
			System.out.println("-------------------------所有学生信息-------------------------");
			System.out.println("|学号          |姓名     ");
			System.out.println("-----------------------------------------------------------");
			checkStudentById2(checkid2);
			System.out.println("-----------------------------------------------------------");
			System.out.println("数据查询完毕,系统自动返回目录......");
			checkStudentPage(scanner2);
			break;
	
		case 4:
			//返回上一级
			sc.stuManagerIndex();
			break;

		default:
			System.out.println("输入有误,请重新输入");
			checkStudentPage(scanner2);
			break;
		}
	
	}
	
	//查看学生信息展示页面
	public void stuManageShow() {
		System.out.println("-------------------------所有学生信息-------------------------");
		System.out.println("|学号     |姓名     |年龄     |性别     |年级     |电话     |EMAIL     |地址");
		System.out.println("-----------------------------------------------------------");
	}
	//根据id查询学生信息的方法
	
	public void checkStudentById(int id) {
		for(int i = 0; i < stus.length; i++) {
			if(id == stus[i].id) {
				System.out.println(stus[i]);
			}
				
		}
	}
	
	//根据id查询学生姓名的方法
	
		public void checkStudentById2(int id) {
			for(int i = 0; i < stus.length; i++) {
				if(id == stus[i].id) {
					System.out.println("|"+stus[i].id+"     |"+stus[i].stuName);
				}
					
			}
		}
	
	
	
	

	
}
