package com.nuedu.demo01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.num = "123";
		p1.name = "张三";
		p1.sex = '男';
		p1.age = 20;
		p1.marry = false;
		p1.IDCard = "12345696523125";
		p1.adress = "天津市东丽区";
		p1.phone = "45566562321";
		
		Person p2 = new Person();
		p2.num = "123";
		p2.name = "李四";
		p2.sex = '男';
		p2.age = 20;
		p2.marry = false;
		p2.IDCard = "12345696523125";
		p2.adress = "天津市东丽区";
		p2.phone = "45566562321";
		
		Person p3 = new Person();
		p3.num = "123";
		p3.name = "王五";
		p3.sex = '女';
		p3.age = 20;
		p3.marry = false;
		p3.IDCard = "12345696523125";
		p3.adress = "天津市东丽区";
		p3.phone = "45566562321";
		
		Person p4 = new Person();
		p4.num = "123";
		p4.name = "赵六";
		p4.sex = '女';
		p4.age = 20;
		p4.marry = true;
		p4.IDCard = "12345696523125";
		p4.adress = "天津市东丽区";
		p4.phone = "45566562321";
		
		p1.getMarry(p2);
		p1.getMarry(p3);
		p1.getMarry(p4);
		
	}
}
