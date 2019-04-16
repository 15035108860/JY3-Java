package com.neuedu.work04;

public class SalariedEmployee extends ColaEmployee{

	double slalay;

	//构造方法
	public SalariedEmployee(String name, int month, double slalay) {
		super(name, month);
		this.slalay = slalay;
	}
	
	//重写工资
	@Override
	public double getSalary(int month) {
		
		if(this.month == month) {
			return slalay + 100;
		}else {
			return slalay;
		}
	}
}
