package com.nuedu.circle;

public class MarryHouse {
	
	public boolean marryRules(Person p1, Person p2) {
		
		if(p1.sex != p2.sex) {
			
			if(p1.marry == false && p2.marry == false) {
				
				if(p1.age >= 22 && p2.age >= 20 && p1.sex == '男' || p1.age >= 20 && p2.age >= 22 && p1.sex == '女') {
					
					p1.marry = true;
					p2.marry = true;
					
					p1.partner.name = p2.name;
					p2.partner.name = p1.name;
					return true;
				}
			}
		}
		
		throw new IllegalArgumentException("这两人不能结婚");
	}

}
