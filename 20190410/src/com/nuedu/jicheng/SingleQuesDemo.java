package com.nuedu.jicheng;

import java.util.Arrays;

public class SingleQuesDemo {

	public static void main(String[] args) {
		
		String[] ops = {"�������","�����","�������","�������"};
		
		SingleQues singleQues = new SingleQues(1, "�ܺ�ϲ����ʲô?", ops, "�������");
		
		
		String[] answer = {"�������"};
		
		boolean b = singleQues.checkAnswer(answer);
		
		singleQues.printQues();
		
		System.out.println("��Ĵ���:"+ Arrays.toString(answer));
		System.out.println(b == true ? "�����" : "�����");
		
	}
}
