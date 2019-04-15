package com.neuedu.com;

public class Player {
	static int sum = 0;

	private Player() {
		sum++;
	}
	

	static Player creatPlayer(int num) {
		Player p = null;
		
		if(sum < num) {
			p = new Player();
			
		}else {
			p = null;
		}
		
		return p;
	}
}
