package javalib;

public class Employee extends Parent{
	String company;
	int salary;
	
	public Employee(String name, int age,String company,int salary) {
		super(name, age);
		this.company=company;
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	public void displayEmp()
	{
		System.out.println("company"+":"+company+" "+"salary"+":"+salary);
	}
	
	
}
