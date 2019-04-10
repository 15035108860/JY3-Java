package com.nuedu.jicheng;

import java.util.Arrays;

public class SingleQuesDemo {

	public static void main(String[] args) {
		
		String[] ops = {"红烧生蚝","烤生蚝","醋溜生蚝","麻辣生蚝"};
		
		SingleQues singleQues = new SingleQues(1, "周浩喜欢吃什么?", ops, "麻辣生蚝");
		
		
		String[] answer = {"麻辣生蚝"};
		
		boolean b = singleQues.checkAnswer(answer);
		
		singleQues.printQues();
		
		System.out.println("你的答案是:"+ Arrays.toString(answer));
		System.out.println(b == true ? "答对了" : "答错了");
		
	}
}
