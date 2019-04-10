package com.nuedu.jicheng;

public class Question {
	
	int i;
	String text;
	String[] options = {};
	
	
	public boolean checkAnswer(String[] ans) {
		
		return false;
	}
	
	public void printQues() {
		System.out.println("Ã‚∫≈:"+i+"  Ã‚∏…:"+text);
		
		for (String str : options) {
			
			System.out.println("\t"+str);
		}
		
		System.out.println("");
	}
}
