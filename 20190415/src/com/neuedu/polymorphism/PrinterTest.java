package com.neuedu.polymorphism;

public class PrinterTest {

	public static void main(String[] args) {
		
		Printer p1 = new BWPrinter();
		p1.print();
		
		Printer p2 = new ColorPrinter();
		p2.print();
	}
}
