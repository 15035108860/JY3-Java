package com.nuedu.date;

import java.util.ArrayList;
import java.util.Collection;

public class CoollectionDemo {

	public static void main(String[] args) {
		
		Collection<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}
