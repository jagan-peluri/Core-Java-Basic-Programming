package javalib;
//13.	Write a Java program to demonstrate method overriding. 
//14.	Write a Java program to demonstrate method overriding with Hierarchical inheritance.

public class MethodOverriding {
	
	public static void main(String[] args) {
		Dog d= new Dog();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
		
		Animal a= new Animal();
		a.makeSound();
				
		
	}
}

