package javalib;
//20.	Write a Java program to demonstrate encapsulation by making fields private and providing getter and setter methods.
public class Person20 {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18)
		{
			this.age = age;
		}
		else {System.err.println("Age must be 18 or above");}
	}
	
}
