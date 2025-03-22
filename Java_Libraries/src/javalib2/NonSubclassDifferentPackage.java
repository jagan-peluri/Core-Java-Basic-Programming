package javalib2;

import javalib.SamePackage3;

public class NonSubclassDifferentPackage {
    public static void main(String[] args) {
        SamePackage3 obj = new SamePackage3();
        System.out.println("Accessing from a non-subclass in a different package:");
        System.out.println("Public: " + obj.publicVar);
        // System.out.println("Protected: " + obj.protectedVar);  // Error
        // System.out.println("Default: " + obj.defaultVar);  // Error
        // System.out.println("Private: " + obj.privateVar);  // Error
    }
}
