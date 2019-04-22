package com.neuedu.objectdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class BufferedDemo {

	public static void main(String[] args) {
		File file = new File("e:\\1.txt");
		try (Reader r = new FileReader(file);
				BufferedReader reader = new BufferedReader(r);){
			
			String str = null;
			while((str = reader.readLine())!=null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
