package javalib;

public class SamePackage3 {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;  // default (no modifier)
    private int privateVar = 40;

    public void display() {
        System.out.println("Inside SamePackage Class:");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
    
    public static void main(String[] args) {
		SamePackage3 s= new SamePackage3();
		s.display();
	}
}
