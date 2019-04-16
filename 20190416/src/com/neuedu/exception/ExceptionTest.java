package com.neuedu.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			Person person = new Person("张三", 203);
			System.out.println(person);
		} catch (NoAgeException e) {
			
			e.printStackTrace();
			
		}
	}
}
