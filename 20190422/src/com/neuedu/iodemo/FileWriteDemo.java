package com.neuedu.iodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteDemo {

	public static void main(String[] args) {
		
		File file = new File("e:\\hello.txt");
		
		try (Writer wr = new FileWriter(file)){
			
			wr.write("ÖÐ¹ú");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
