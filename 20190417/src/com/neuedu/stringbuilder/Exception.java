package com.neuedu.stringbuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


import javax.imageio.stream.FileImageInputStream;

public class Exception {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream(new File("dsdsa"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("文件名输入有误");
		}finally {
			// TODO: handle finally clause
			System.out.println(6+5);
		}
	}
}
