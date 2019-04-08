package com.nuedu.demo01;

public class Person {
	
	String num;
	String name;
	char sex;
	int age;
	boolean marry;
	String IDCard;
	String adress;
	String phone;
	String partner;
	
	public void getMarry(Person p) {
		if(this.sex != p.sex && this.marry == false && p.marry == false) {
			System.out.println(this.name+"和"+p.name+"你们结婚挺好!!");
			this.partner = p.name;
			p.partner = this.name;
			System.out.println("张三的对象是"+this.partner);
		}else {
			System.out.println(this.name+"和"+p.name+"你们结婚可能不太好!!");
		}
	}
	
	
}
