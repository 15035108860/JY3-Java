package com.nuedu.demo01;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("�������û���");
		String name = sca.next();
		System.out.println("����������");
		String psw = sca.next();
		
		Person p = new Person();
		
		p.checkUser(name, psw);
		
		sca.close();
	}
}
