package javalib;
//8.	Write a Java program to call a constructor from another constructor using this().
public class Question8 {

	String name;
	int age;
	String branch;

	
	public Question8()
	{
		this("ram",21,"CSE");
		System.out.println("Default constructor");
	}
	
	public Question8(String name, int age)
	{
		this(name,age,"Ai&Ds");
		System.out.println("with two parameters");
	}
	
	public Question8(String name,int age,String branch)
	{
		this.name=name;
		this.age=age;
		this.branch=branch;
		System.out.println("constructor with all three paraneters");
	}
	  public void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Branch: " + branch);
	    }
	  
	  public static void main(String[] args) {
		
		  Question8 s1 = new Question8(); // Calls default constructor
	        s1.display();


	        Question8 s2 = new Question8("Alice", 20); // Calls constructor with name & age
	        s2.display();

	        Question8 s3 = new Question8("Bob", 22, "Computer Science"); // Calls constructor with all parameters
	        s3.display(); s2 = new Question8("Alice", 20); // Calls constructor with name & age
	        s2.display();

	        
	}
	}

