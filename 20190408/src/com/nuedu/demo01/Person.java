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
			System.out.println(this.name+"��"+p.name+"���ǽ��ͦ��!!");
			this.partner = p.name;
			p.partner = this.name;
			System.out.println("�����Ķ�����"+this.partner);
		}else {
			System.out.println(this.name+"��"+p.name+"���ǽ����ܲ�̫��!!");
		}
	}
	
	
}
