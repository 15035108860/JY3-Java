package com.nuedu.demo01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.num = "123";
		p1.name = "����";
		p1.sex = '��';
		p1.age = 20;
		p1.marry = false;
		p1.IDCard = "12345696523125";
		p1.adress = "����ж�����";
		p1.phone = "45566562321";
		
		Person p2 = new Person();
		p2.num = "123";
		p2.name = "����";
		p2.sex = '��';
		p2.age = 20;
		p2.marry = false;
		p2.IDCard = "12345696523125";
		p2.adress = "����ж�����";
		p2.phone = "45566562321";
		
		Person p3 = new Person();
		p3.num = "123";
		p3.name = "����";
		p3.sex = 'Ů';
		p3.age = 20;
		p3.marry = false;
		p3.IDCard = "12345696523125";
		p3.adress = "����ж�����";
		p3.phone = "45566562321";
		
		Person p4 = new Person();
		p4.num = "123";
		p4.name = "����";
		p4.sex = 'Ů';
		p4.age = 20;
		p4.marry = true;
		p4.IDCard = "12345696523125";
		p4.adress = "����ж�����";
		p4.phone = "45566562321";
		
		p1.getMarry(p2);
		p1.getMarry(p3);
		p1.getMarry(p4);
		
	}
}
