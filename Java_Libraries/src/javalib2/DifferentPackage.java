package javalib2;

import javalib.SamePackage3;

public class DifferentPackage extends SamePackage3 {
    public void accessMembers() {
        System.out.println("Accessing from a subclass in a different package:");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar); //  Accessible (Subclass)
        // System.out.println("Default: " + defaultVar);  //  Error (default not accessible)
        // System.out.println("Private: " + privateVar);  //  Error (private not accessible)
    }

    public static void main(String[] args) {
        DifferentPackage obj = new DifferentPackage();
        obj.accessMembers();
    }
}
