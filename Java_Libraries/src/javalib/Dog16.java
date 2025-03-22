package javalib;

class Dog16 extends Animal16 {
    String name = "Dog";

    Dog16() {
        super();
        System.out.println("Dog Constructor Called");
    }

    public void showNames() {
        System.out.println("Child class name: " + this.name);
        System.out.println("Parent class name: " + super.name);
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("This is a Dog");
    }
}