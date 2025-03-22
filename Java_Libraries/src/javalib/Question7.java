package javalib;
//7.	Write a Java program to create a class with multiple constructors (constructor overloading).
public class Question7 {

	String name;
	int age;
	
	public Question7()
	{
		this.name="Ram";
		this.age=20;
		System.out.println("constructor without parameters");
	}
	
	public Question7(String name)
	{
		this.name=name;
		this.age=21;
		System.out.println("constructor with one parameter");
	}
	public Question7(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("constructor with two parameters");
	}
	
	public void dispaly()
	{
		System.out.println("name"+":"+name +" "+"age"+":"+age);
	}
	public static void main(String[] args) {
		Question7 q7 = new Question7();
		q7.dispaly();
		
		Question7 q=new Question7("krishna");
		q.hashCode();
		
		Question7 q1 = new Question7("Raman",21);
		q1.hashCode();
	}
}
