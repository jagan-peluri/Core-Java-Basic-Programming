package javalib;

class MathOperations {
    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of two integers: " + math.add(5, 10));
        System.out.println("Sum of two doubles: " + math.add(5.5, 2.3));
        System.out.println("Sum of three integers: " + math.add(1, 2, 3));
        System.out.println("Concatenation of two strings: " + math.add("Hello, ", "World!"));
    }
}
