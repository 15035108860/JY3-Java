package com.nuedu.date;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {

	public static void main(String[] args) {
		
		Collection<String> coll = new ArrayList<String>();
		
		coll.add("a");
		coll.add("b");
		coll.add("c");
		coll.add("d");
		coll.add("e");
		
		//迭代器实现对ArrayList集合元素的取出
		Iterator<String> it = coll.iterator();
		
		boolean b = it.hasNext();
		System.out.println(b);
		
		String s = it.next();
		System.out.println(s);
		for (String string : coll) {
			System.out.println(string);
		}
		
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1.length());
		}
	}
}
