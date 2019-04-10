package com.nuedu.jicheng;

public class SingleQues extends Question{

	String answer;
	
	public SingleQues() {
		
	}
	
	public SingleQues(int i, String text, String[] ops, String answer) {
		
		this.i = i;
		this.text = text;
		this.options = ops;
		this.answer = answer;	
	}
	
	@Override
	public boolean checkAnswer(String[] ans) {
		
		if(ans == null || ans.length !=1) {
			return false;
		}else {
			
			return this.answer.equals(ans[0]);
		}
	}
	
}
