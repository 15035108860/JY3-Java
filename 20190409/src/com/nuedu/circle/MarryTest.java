package com.nuedu.circle;

public class MarryTest {

	public static void main(String[] args) {
		
		Person boy = new Person("123456","�ܺ�",'��',24,false,"12456","��ɽ","456965",null);
		Person girl = new Person("123456","���",'Ů',20,false,"12456","��ɽ","456965",null);
		boy.partner = girl;
		girl.partner = boy;
		boolean marry = boy.getMarry(girl);
		
		System.out.println(marry == true ? "��ϲ�ܺ�,�ҵ����" : "���ż�,��ȥ����");
		System.out.println(boy.name+"�Ļ���״̬��"+boy.marry);
		System.out.println(girl.name+"�Ļ���״̬��"+girl.marry);
		System.out.println(boy.name+"�İ�����:"+boy.partner.name);
		System.out.println(girl.name+"�İ�����:"+girl.partner.name);
		
	}
}
