package com.nuedu.date;

public class Student {

	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!( obj instanceof Student)) {
			
			System.out.println("ÊäÈëÀàĞÍ´íÎó");
			return false;
		}
		Student other = (Student) obj;	
		return this.age == other.age && this.name.equals(other.name);
	}
	
}
