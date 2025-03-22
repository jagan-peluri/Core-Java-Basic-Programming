package javalib;

public class SamePackageTest {
    public static void main(String[] args) {
        SamePackage3 obj = new SamePackage3();
        System.out.println("Accessing from a different class in the same package:");
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
        // System.out.println("Private: " + obj.privateVar); //  Error (private not accessible)
    }
}
