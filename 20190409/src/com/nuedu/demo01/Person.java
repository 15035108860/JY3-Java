package com.nuedu.demo01;

public class Person {

	String username;
	String password;
	
	
	public Person() {
		username = "sd";
	}


	public void checkUser(String username, String password) {
		
		String[] name = {"a","b","c"};
		String[] psw = {"a","b","c"};
		
		for(int i = 0; i < name.length; i++) {
			
			if(name[i].equals(username) && psw[i].equals(password)) {
				
				System.out.println("µÇÂ¼³É¹¦");
				return;
			}else {
				
				System.out.println("µÇÂ¼Ê§°Ü");
				return;
			}
		}
	}
}
