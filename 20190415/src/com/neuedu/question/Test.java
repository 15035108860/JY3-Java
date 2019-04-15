package com.neuedu.question;

public class Test {

	public static void main(String[] args) {
		//单选
		System.out.println("单选题");
		String text = "世界上最帅的人是谁?";
		String[] options = new String[4];
		options[0] = "A.胡歌";
		options[1] = "B.霍建华";
		options[2] = "C.彭于晏";
		options[3] = "D.谢霆锋";
		
		int[] answer = {1};
		
		SingleChoice singleChoice = new SingleChoice(text, options, answer);
		boolean check = singleChoice.check(answer);
		//System.out.println(check);
		System.out.println(check == true ? "恭喜你答对了" : "抱歉打错了");
		singleChoice.toString();
		
		//多选
		System.out.println("多选题");
		text = "周浩爱吃什么";
		options[0] = "A.活生蚝";
		options[1] = "B.炸生蚝";
		options[2] = "C.烤生蚝";
		options[3] = "D.煎生蚝";
		
		int[] answer1 = {1,2,3,4};
		
		MultiChoice mc = new MultiChoice(text, options, answer1);
		boolean check2 = mc.check(answer1);
		System.out.println(check2 == true ? "恭喜你答对了" : "抱歉打错了");
	}
}
