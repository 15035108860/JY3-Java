package com.nuedu.demo02;

public class PersonCreate {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "zahngsan";
		p1.age = 33;
		p1.height = 1.73;
		
		Person p2 = new Person();
		p2.name = "lisi";
		p1.age = 44;
		p1.height = 1.74;
			
		p1.sayHellow();
		p2.sayHellow();
	}
}
