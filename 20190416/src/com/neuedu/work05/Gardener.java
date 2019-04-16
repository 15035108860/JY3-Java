package com.neuedu.work05;

import java.util.Scanner;

public class Gardener {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		while(true) {
			System.out.println("你想种颗啥子树");
			String type = sca.next();
			Fruit create = create(type);
			if(create != null) {
				create.createFruit();
			}else {
				System.out.println("抱歉,没有这种果树");
				return;
			}
		}
	}
	
	public static Fruit create(String type) {
		Fruit fruit;
		if(type.equals("apple")) {
			fruit = new Apple();
		}else if(type.equals("bananaer")){
			fruit = new Bananaer();
		}else if(type.equals("grape")) {
			fruit = new Grape();
		}else {
			fruit = null;
		}
		return fruit;
	}
}
