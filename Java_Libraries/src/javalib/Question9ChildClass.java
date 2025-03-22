package javalib;

public class Question9ChildClass extends Question9ParentClass {

	String course;
	
	public Question9ChildClass(String name,int age,String course) 
	{
	  super(name,age);
	  this.course=course;
	}
	
	public void dispalyDetails()
	{
		display();
		System.out.println("constructor of child class");
	}
	
	
}
