package com.nuedu.demo01;

public class NotBook {

	char colocr;
	String cpu;
	
	public NotBook(char colocr, String cpu) {
		super();
		this.colocr = colocr;
		this.cpu = cpu;
	}
	public NotBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void showAll() {
		System.out.println("�ʼǱ�����ɫ��:"+colocr);
		System.out.println("�ʼǱ�cpu���ͺ���:"+cpu);
	}
}
