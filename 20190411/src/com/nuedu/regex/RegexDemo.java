package com.nuedu.regex;

import java.util.Scanner;

public class RegexDemo {

	public static void main(String[] args) {
		Object object = new Object();
		
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入你的qq");
		String qq = sca.next();
		
		String regex = "[1-9][0-9]{4,14}";
		
		//匹配正则表达式
		boolean matches = qq.matches(regex);
		
		//System.out.println(matches);
		
		if(matches == true) {
			System.out.println("输入正确");
		}else {
			System.out.println("格式错误");
		}
	}
}
