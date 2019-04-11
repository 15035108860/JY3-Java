package com.nuedu.test;

public class Test {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		//方法1
		
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;
		 
		
		//方法2
		
//		 a = a + b; 
//		 b = a - b; 
//		 a = a - b;
		 
		
		//方法三,可能超出范围
		/*
		 * a = a * b; 
		 * b = a / b; 
		 * a = a / b;
		 */
		
		System.out.println(a +"  "+ b);
	}
}
