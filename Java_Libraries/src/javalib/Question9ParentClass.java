package javalib;

public class Question9ParentClass {

	String name;
	int age;
	
	public Question9ParentClass(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("parent constructor");
	}
	
	public void display()
	{

        System.out.println("Name: " + name + ", Age: " + age);
	}
	
	
}
