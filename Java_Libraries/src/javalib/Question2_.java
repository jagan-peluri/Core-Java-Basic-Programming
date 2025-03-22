package javalib;
//2.	Write a Java program to call a non-static member in a static method outside the class.
public class Question2_ {

	public static void main(String[] args) {
		Question2 q = new Question2();
		System.out.println(q.s);
	}
}
