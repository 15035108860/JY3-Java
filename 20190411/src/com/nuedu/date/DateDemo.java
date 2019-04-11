package com.nuedu.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(1607616000000L);
		
		String format = df.format(date);
		System.out.println(format);
		
		String date1 = "2019-04-11";
		Date parse = df.parse(date1);
		System.out.println(parse);
	}
}
