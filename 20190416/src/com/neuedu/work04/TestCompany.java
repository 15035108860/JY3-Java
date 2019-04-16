package com.neuedu.work04;

import java.util.Scanner;

public class TestCompany {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入你要查询工资的月份");
		int month = sca.nextInt();
		
		ColaEmployee[] company = {		
			new SalariedEmployee("张三", 3, 4500),
			new HourlyEmployee("李四", 4, 80, 150),
			new SalesEmployee("王五", 5, 2000, 5)
		};
		
		for(int i = 0; i < company.length; i++) {
			double salary = company[i].getSalary(month);
			System.out.println(company[i].name +"在"+month+"月的工资是:"+salary);
		}
	}

}
