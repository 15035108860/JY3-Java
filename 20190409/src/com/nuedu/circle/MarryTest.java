package com.nuedu.circle;

public class MarryTest {

	public static void main(String[] args) {
		
		Person boy = new Person("123456","周浩",'男',24,false,"12456","唐山","456965",null);
		Person girl = new Person("123456","生蚝",'女',20,false,"12456","唐山","456965",null);
		boy.partner = girl;
		girl.partner = boy;
		boolean marry = boy.getMarry(girl);
		
		System.out.println(marry == true ? "恭喜周浩,找到生蚝" : "别着急,回去想想");
		System.out.println(boy.name+"的婚姻状态是"+boy.marry);
		System.out.println(girl.name+"的婚姻状态是"+girl.marry);
		System.out.println(boy.name+"的伴侣是:"+boy.partner.name);
		System.out.println(girl.name+"的伴侣是:"+girl.partner.name);
		
	}
}
