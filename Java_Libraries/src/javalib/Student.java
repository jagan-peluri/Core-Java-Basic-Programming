package javalib;

public class Student extends Parent {

	String course;

	public Student(String name, int age,String course) {
		super(name, age);
		this.course=course;
		// TODO Auto-generated constructor stub
	}
	
	public void displayStudent()
	{
		System.out.println("name"+":"+name +" "+"age"+":"+age+" "+"course"+":"+course);
	}
	
}
