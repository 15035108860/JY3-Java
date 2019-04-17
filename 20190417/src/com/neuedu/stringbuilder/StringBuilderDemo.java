package com.neuedu.stringbuilder;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		//append方法
		stringBuilder.append("hello").append("World").append("");
		System.out.println(stringBuilder);
		
		//charAt
		/*
		 * char charAt = stringBuilder.charAt(0); System.out.println(charAt);
		 */
		
		//delete
		/*
		 * StringBuilder delete = stringBuilder.delete(0, 2);
		 * System.out.println(delete);
		 */
		
		//indexOf
		int indexOf = stringBuilder.indexOf("W");
		System.out.println(indexOf);
		
		//insert
		StringBuilder insert = stringBuilder.insert(0, "nihao");
		System.out.println(insert);
		
		//lastIndexOf
		int lastIndexOf = stringBuilder.lastIndexOf("l");
		System.out.println(lastIndexOf);
		
		//replace
		StringBuilder replace = stringBuilder.replace(0, 5, "你好");
		System.out.println(replace);
		
		//reverse翻转
		StringBuilder reverse = stringBuilder.reverse();
		System.out.println(replace);
		
		//toString
		String string = stringBuilder.toString();
		System.out.println(string);
		
		
		String a = "abc";
		String b = "ABC";
		int compareTo = a.compareTo(b);
		System.out.println(compareTo);
		
	}

}
