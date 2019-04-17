package com.neuedu.work;

import java.util.Scanner;

public class Work01 {

	public static void main(String[] args) {
		while(true) {
			Scanner sca = new Scanner(System.in);
			System.out.println("请输入除数");
			String a = sca.next();
			System.out.println("请输入被除数");
			String b = sca.next();
			
			
			
			try {
				int a1 = Integer.parseInt(a);
				int b1 = Integer.parseInt(b);
				System.out.println(b+"除以"+a+"的结果是:"+b1/a1);
			} catch (NumberFormatException e) {
				System.err.println("数字格式化异常,捕获成功");
			} catch (ArithmeticException e) {
				System.err.println("算数异常,捕获成功");
			}finally {
				System.out.println("总是被执行");
			}
		}
	}
}
