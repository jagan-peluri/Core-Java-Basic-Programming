package javalib;

public class Parent {

	String name;
	int age;
	
	public Parent(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void display()
	{
		System.out.println("name"+":"+name +" " +"age"+":"+age);
	}
	
}
