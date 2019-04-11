package com.nuedu.date;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int i = c.get(Calendar.YEAR);
		System.out.println(i);
		
	}
}
