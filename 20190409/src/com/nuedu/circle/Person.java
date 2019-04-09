package com.nuedu.circle;

public class Person {

	String num;
	String name;
	char sex;
	int age;
	boolean marry;
	String IDCard;
	String adress;
	String phone;
	Person partner;
	
	public Person() {
		
	}

	public Person(String num, String name, char sex, int age, boolean marry, String iDCard, String adress, String phone,
			Person partner) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.marry = marry;
		IDCard = iDCard;
		this.adress = adress;
		this.phone = phone;
		this.partner = partner;
	}
	
	
	public boolean getMarry(Person p) {
		
		MarryHouse marryHouse = new MarryHouse();
		
		boolean rules = marryHouse.marryRules(this, p);
		
		return rules;
	}
	
}
