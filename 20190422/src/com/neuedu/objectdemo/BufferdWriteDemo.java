package com.neuedu.objectdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class BufferdWriteDemo {

	public static void main(String[] args) {
		File file = new File("e:\\1.txt");
		try (Writer w = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(w);){
			bw.newLine();
			bw.write("°¡¹þ¹þ¹þ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
