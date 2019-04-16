package com.neuedu.work04;

public class SalesEmployee extends ColaEmployee{

	double xiaoShaoEr;
	double tiChenglu;
	public SalesEmployee(String name, int month, double xiaoShaoEr, double tiChenglu) {
		super(name, month);
		this.xiaoShaoEr = xiaoShaoEr;
		this.tiChenglu = tiChenglu;
	}
	
	@Override
	public double getSalary(int month) {
		if(this.month == month) {
			return xiaoShaoEr * tiChenglu + 100;
		}else {
			return xiaoShaoEr * tiChenglu;
		}
	}
	
}
