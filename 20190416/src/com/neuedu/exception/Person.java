package com.neuedu.exception;

public class Person {

	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) throws NoAgeException {

		if(age < 0 || age > 200) {
			throw new NoAgeException(age+"年龄数值非法");
		}
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
}
