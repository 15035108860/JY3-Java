package com.neuedu.question;

public class MultiChoice extends Question{

	String[] options;
	int[] answers;
	public MultiChoice(String text, String[] options, int[] answers) {
		super();
		this.text = text;
		this.options = options;
		this.answers = answers;
	}
	
	@Override
	public boolean check(int[] answers) {
		if(this.answers.equals(answers)) {
			return true;
		}else {
			return false;
		}		
		
	}
}
