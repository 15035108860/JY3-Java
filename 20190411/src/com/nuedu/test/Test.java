package com.nuedu.test;

public class Test {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		//����1
		
		 a = a ^ b;
		 b = a ^ b;
		 a = a ^ b;
		 
		
		//����2
		
//		 a = a + b; 
//		 b = a - b; 
//		 a = a - b;
		 
		
		//������,���ܳ�����Χ
		/*
		 * a = a * b; 
		 * b = a / b; 
		 * a = a / b;
		 */
		
		System.out.println(a +"  "+ b);
	}
}
