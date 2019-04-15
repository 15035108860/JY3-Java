package com.neuedu.question;

import java.util.Arrays;

public class SingleChoice extends Question{

	String[] options;
	
	int answer;

	public SingleChoice(String text,String[] options, int[] answer) {
		super();
		this.text = text;
		this.options = options;
		this.answer = answer[0];
	}	
	
	@Override
	public boolean check(int[] answers) {
		if(answers.length > 1) {
			return false;
		}else {
			if(answers[0] == this.answer);
			return true;
		}
	}
}
