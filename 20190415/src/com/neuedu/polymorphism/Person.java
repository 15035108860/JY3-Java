package com.neuedu.polymorphism;

public class Person {

	public static void main(String[] args) {
		Person person = new Person();
		Plane p = new Plane();
		Train t = new Train();
		Vehicle v1 = new Train();
		Vehicle v2 = new Plane();
		
		person.type(p);
		person.type(t);
		person.type(v1);
		person.type(v2);
		
	}
	public void type(Vehicle v) {
		v.type();
	}
}
