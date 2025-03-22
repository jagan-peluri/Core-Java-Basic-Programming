package javalib;
//1.Write a Java program to call a non-static method inside a static method within the same class.
public class Question1 {

	public void nonstaticMethod()
	{
		System.out.println("this is non static method");
	}
	
	public static void staticMethod()
	{
		Question1 q= new Question1();
		q.nonstaticMethod();
		System.out.println("static method called non static method");
	}
	
	public static void main(String[] args) {
		staticMethod();
	}
}
