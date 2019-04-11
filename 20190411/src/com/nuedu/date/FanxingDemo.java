package com.nuedu.date;

import java.util.ArrayList;
import java.util.Iterator;

public class FanxingDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Cook> cs = new ArrayList<Cook>();
		ArrayList<Waiter> fwy = new ArrayList<Waiter>();
		ArrayList<Manager> jl = new ArrayList<Manager>();
		
		cs.add(new Cook("张三","后厨"));
		cs.add(new Cook("李四","后厨"));
		
		fwy.add(new Waiter("翠花", "传菜部"));
		fwy.add(new Waiter("酸菜", "传菜部"));
		
		jl.add(new Manager("小强", "经理"));
		jl.add(new Manager("小明", "经理"));
		
		iterator(cs);
		iterator(fwy);
		iterator(jl);

	}
	public static void iterator(ArrayList<? extends Emloyee> arr) {
		Iterator<? extends Emloyee> it = arr.iterator();
		while(it.hasNext()) {
			Emloyee e = it.next();
			e.work();
			
		}
	}
}
class Emloyee{
	String name;
	String department;
	
	public Emloyee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	
	public Emloyee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void work() {
		
	}
}

class Cook extends Emloyee{
	
	public Cook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cook(String name, String department) {
		super(name, department);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println(name+"在做菜");
	};
}

class Waiter extends Emloyee{
	
	public Waiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Waiter(String name, String department) {
		super(name, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println(name+"在上菜");
	}
}

class Manager extends Emloyee{
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String department) {
		super(name, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println(name+"在发工资");
	}
}