package com.neuedu.work04;

public class HourlyEmployee extends ColaEmployee{

	double salary;
	int hours;
	
	public HourlyEmployee(String name, int month, double salary, int hours) {
		super(name, month);
		this.salary = salary;
		this.hours = hours;
	}
	
	@Override
	public double getSalary(int month) {
		if(this.month == month) {
			if(hours > 160) {
				return salary*hours*1.5;
			}else {
				return salary*hours;
			}
		}else {
			if(hours > 160) {
				return salary*hours*1.5;
			}else {
				return salary*hours;
			}
		}
		
	}

}
