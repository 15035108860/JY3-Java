package com.nuedu.regex;

import java.util.Scanner;

public class RegexDemo {

	public static void main(String[] args) {
		Object object = new Object();
		
		Scanner sca = new Scanner(System.in);
		System.out.println("���������qq");
		String qq = sca.next();
		
		String regex = "[1-9][0-9]{4,14}";
		
		//ƥ��������ʽ
		boolean matches = qq.matches(regex);
		
		//System.out.println(matches);
		
		if(matches == true) {
			System.out.println("������ȷ");
		}else {
			System.out.println("��ʽ����");
		}
	}
}
