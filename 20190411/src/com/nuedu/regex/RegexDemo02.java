package com.nuedu.regex;



public class RegexDemo02 {
	public static void main(String[] args) {
		//String src = "1-k2-3-4-8-9-3";
		//String regex = "-";
		//String[] split = src.split(regex);
		//System.out.println(Arrays.toString(split));
		
		String s = "111111111111";
		String regex = "1";
		
		String replaceAll = s.replaceAll(regex, "*");
		System.out.println(replaceAll);
	}
	

}
