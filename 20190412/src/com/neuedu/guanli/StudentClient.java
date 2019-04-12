package com.neuedu.guanli;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {

	//初始化用户名和密码
	static String userName = "admin";
	static String passWord = "admin";
	Scanner sca = new Scanner(System.in);
	StudentManager sm = new StudentManager(this);
	
	
	public static void main(String[] args) {
	
		StudentClient sc = new StudentClient();
		sc.welcome();
	}
	
	//欢迎界面
	public void welcome() {
		System.out.println("***************欢迎登录学生管理系统界面***************");
		System.out.println(" 1.登录             2.退出");
		System.out.println("************************************************");
		
		System.out.println("请选择");
		int nextInt = sca.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录!");
			System.out.println("请输入用户名");
			String username = sca.next();
			System.out.println("请输入密码");
			String password = sca.next();
			Admin admin = new Admin(username, password);
			boolean login = login(admin);
			if(login == true) {
				System.out.println("欢迎您:"+username);
				stuManagerIndex();
			}else {
				System.out.println("登录失败");
				welcome();
			}
			
			break;
		case 2:
			System.out.println("已退出");
			exitSystem();
			break;
			
		default:
			System.out.println("输入有误,重新选择");
			welcome();
			break;
		}
	}
	
	//登录方法
	public boolean login(Admin admin) {
		
		if(userName.equals(admin.userName) && passWord.equals(admin.passWord)) {
			
			return true;
		}
		
		return false;
	}
	
	//退出系统
	public void exitSystem() {
		System.exit(0);
	}
	
	//学生管理首页
	
	public void stuManagerIndex() {
		System.out.println("****************请选择要操作的信息对应的数字****************");
		System.out.println("1.查看学生信息  2.添加学生信息  3.删除学生信息  4.修改学生信息  5.退出");
		System.out.println("*****************************************************");
		System.out.println("请选择:");
		int nextInt = sca.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			break;
		
		case 2:
			sm.addStuPage(sca);
			break;
		default:
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
