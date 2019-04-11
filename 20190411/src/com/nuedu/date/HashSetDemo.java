package com.nuedu.date;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		
		hs.add("f");
		hs.add("d");
		hs.add("b");
		
		Iterator<String> iterator = hs.iterator();
		for (String string : hs) {
			System.out.println(string);
		}
	}

}
