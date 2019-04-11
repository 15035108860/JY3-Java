package com.nuedu.date;

import java.util.HashSet;
import java.util.Iterator;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<Student>();
		
		hs.add(new Student("张三", 14));
		hs.add(new Student("李四", 17));
		hs.add(new Student("张三", 14));
		hs.add(new Student("赵六", 12));
		
		Iterator<Student> iterator = hs.iterator();
		
		while(iterator.hasNext()) {
			Student next = iterator.next();
			System.out.println(next);
		}
	}

}
