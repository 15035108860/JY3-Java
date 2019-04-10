package com.nuedu.studentmanage;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		String[] student = new String[8];

		System.out.println("-----------欢迎登陆学生信息管理系统--------------");
		System.out.println("           1. 登陆                   2.退出                                ");
		System.out.println("-------------------------------------------");

		Scanner sca = new Scanner(System.in);
		System.out.print("请选择");
		System.out.println();
		int select = sca.nextInt();

		if (select == 1) {

			System.out.println("欢迎登陆!");

			System.out.print("请输入用户名:");
			String username = sca.next();
			System.out.print("请输入密码:");
			String password = sca.next();

			System.out.println("登录成功");
			System.out.println("欢迎您," + username);

			while (true) {
				System.out.println("***************请选择要操作的信息对应数字***************");
				System.out.println("*  1.查看学生信息   2.添加学生信息   3.删除学生信息   4.修改学生信息   5.退出");
				System.out.println("***************请选择要操作的信息对应数字***************");
				System.out.print("请输入操作对应编号:");
				int operationNum = sca.nextInt();

				// 对应操作编号的信息
				if (operationNum == 1) {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("+  1.查看所有学生信息   2.根据ID学生信息   3.根据ID查询学生姓名   4.返回上一级             +");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					
					System.out.println("请选择菜单:");
					int select02 = sca.nextInt();
					
					if(select02 == 2) {
						System.out.println("请输入要查询的ID:");
						int select03 = sca.nextInt();
						System.out.println("-----------------------------------所有学生信息-----------------------------------");
						System.out.println("|学号\t|姓名\t|年龄\t|性别 \t|年级\t|电话\t\t|联系方式\t|邮箱");
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println(student[0]+"\t"+student[1]+"\t"+student[2]+"\t"+
						student[3]+"\t"+student[4]+"\t"+student[5]+"\t"+student[6]+"\t"+student[7]);
						System.out.println("-------------------------------------------------------------------------------");
						System.out.println("数据查询成功,系统将自动返回上层目录");
						continue;
					}else {
						continue;
					}
				
				} else if (operationNum == 2) {
					// 添加学生信息
					System.out.print("请输入学生id:");
					String id = sca.next();
					student[0] = id;
					
					System.out.print("请输入学生姓名:");
					String sname = sca.next();
					student[1] = sname;
					
					System.out.print("请输入学生年龄:");
					String age = sca.next();
					student[2] = age;
					System.out.print("请输入学生性别:");
					String sex = sca.next();
					student[3] = sex;
					System.out.print("请输入学生年级:");
					String grade = sca.next();
					student[4] = grade;
					System.out.print("请输入学生地址:");
					String adress = sca.next();
					student[5] = adress;
					System.out.print("请输入学生联系方式:");
					String phone = sca.next();
					student[6] = phone;
					System.out.print("请输入学生邮箱:");
					String email = sca.next();
					student[7] = email;

					System.out.println("数据保存成功,系统将自动返回上层目录");
					continue;

				} else if (operationNum == 3) {
					
					//删除功能
					
					
				} else if (operationNum == 4) {

					//修改功能
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("+  1.根据ID修改学生全部信息   2.根据ID修改学生部分信息   3.返回上级目录   4.系统推出   +");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					
					System.out.println("请选择菜单:");
					int select01 = sca.nextInt();
					
					if(select01 == 2) {
						System.out.println("请输入要修改的ID:");
						int select02 = sca.nextInt();
						
						System.out.println("请输入要修改的属性:");
						String select03 = sca.next();
						System.out.println("请输入修改后的属性:");
						String select04 = sca.next();
						
						if(select03.equals("age")) {
							student[2] = select04;
							continue;
						}
						
					}else if(select01 == 4) {
						return;
					}else {
						continue;
					}
					
				} else if (operationNum == 5) {
					System.out.println("欢迎下次再来!!");
					continue;
				} else {
					System.out.println("输入操作号码非法,退出!!");
					continue;
				}
				
			}
		} else {
			System.out.println("欢迎下次再来!!");
			return;
		}

	}
}
