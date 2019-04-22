package com.neuedu.iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReadDemo {
	public static void main(String[] args) {
		
		File file = new File("e:\\hello.txt");
		try(Reader r = new FileReader(file)) {
			
			int len = 0;
			char[] c = new char[1024];
			while((len = r.read(c))!=-1) {
				String s = new String(c,0,len);
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
