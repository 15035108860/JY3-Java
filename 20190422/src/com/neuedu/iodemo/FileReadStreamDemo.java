/**
 * 复制文件
 */
package com.neuedu.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileReadStreamDemo {

	public static void main(String[] args) {
		//控制台输入文件路�?
		Scanner sca = new Scanner(System.in);
		System.out.println("输入你想复制文件的路�?");
		String srcpath = sca.next();
		String[] split = srcpath.split("\\.");
		
		String descpath = split[0]+"_副本."+split[1];
		
		
		//明确文件地址
		File srcfile = new File(srcpath);
		File descfile = new File(descpath);
		
		//创建输入输出�?
		InputStream is = null;
		OutputStream os = null;
		//判断文件是否存在
		
		//文件不存在创建文�?,并添加文件内�?
		if(!srcfile.exists()) {
			try {
				srcfile.createNewFile();
				os =  new FileOutputStream(srcfile);
				System.out.println("请给文件中添加的内容");
				String content = sca.next();
				os.write(content.getBytes());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		//文件存在,�?始复制文�?
		try {
			//关联输入输出�?
			is = new FileInputStream(srcfile);
			os =  new FileOutputStream(descfile);
			//存在�?始复制文�?
			int len = 0;
			byte[] b = new byte[1024];
			while((len = is.read(b)) != -1) {
				os.write(b,0,len);
			}
			System.out.println("copy成功,请查�?");
		} catch (Exception e) {
			
		}finally {
			sca.close();
			if(is != null && os != null) {
				try {	
					os.close();
					is.close();
				} catch (Exception e2) {
					
				}
			}
		}	
	}
}
