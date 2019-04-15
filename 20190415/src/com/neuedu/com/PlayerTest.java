package com.neuedu.com;

import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) {
		
		System.out.println("请输入你要创建的球员个数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		while(true) {
			Player player = Player.creatPlayer(num);
			if(player  != null) {
				System.out.println("创建了"+ Player.sum+"号球员");
			}else {
				System.out.println("创建了"+ Player.sum+"个球员,不能创建了");
				break;
			}
		}
	}
}
