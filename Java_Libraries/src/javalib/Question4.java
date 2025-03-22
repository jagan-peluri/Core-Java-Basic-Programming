package javalib;
//4.	Write a Java program to create and use a constructor. 
public class Question4 {

	String name;
	int age;
	
	public Question4(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

	public static void main(String[] args) {
		Question4 q4 = new Question4("ram",22);
		q4.display();
		Question4 q=new Question4("Krishna",21);
		q.display();
		
	}
}
