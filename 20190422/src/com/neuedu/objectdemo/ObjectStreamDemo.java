package com.neuedu.objectdemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		
		//序列化
//		Account account = new Account("你好","jkl");
//		
//		File file = new File("e:\\account.txt");
//		try (OutputStream os = new FileOutputStream(file);
//			ObjectOutputStream oos = new ObjectOutputStream(os);){	
//			oos.writeObject(account);
//			System.out.println("写出成功");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
//		//反序列化
		File file = new File("e:\\account.txt");
		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file));){
			
			Object readObject = oos.readObject();
			
			if(readObject instanceof Account) {
				Account ac = (Account) readObject;
				System.out.println(ac);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Account implements Serializable{
	private String userName;
	private String pws;
	public Account(String userName, String pws) {
		super();
		this.userName = userName;
		this.pws = pws;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPws() {
		return pws;
	}
	public void setPws(String pws) {
		this.pws = pws;
	}
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", pws=" + pws + "]";
	}
	
	
}
