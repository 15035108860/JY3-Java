package com.nuedu.demo01;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name = sca.next();
		System.out.println("请输入密码");
		String psw = sca.next();
		
		Person p = new Person();
		
		p.checkUser(name, psw);
		
		sca.close();
	}
}
