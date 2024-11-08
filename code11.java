// Define the package for ClassA
package package1;

public class ClassA {
    // public variable - accessible from anywhere
    public int publicVar = 10;

    // protected variable - accessible within the same package and subclasses
    protected int protectedVar = 20;

    // default (package-private) variable - accessible within the same package only
    int defaultVar = 30;

    // private variable - accessible only within this class
    private int privateVar = 40;

    // Method to display all variables of ClassA
    public void display() {
        System.out.println("ClassA - publicVar: " + publicVar);
        System.out.println("ClassA - protectedVar: " + protectedVar);
        System.out.println("ClassA - defaultVar: " + defaultVar);
        System.out.println("ClassA - privateVar: " + privateVar);
    }
}



//----------------------------------------------------

// package B

// Define the package for ClassB
package package2;

import package1.ClassA;

public class ClassB extends ClassA {

    public void show() {
        // Accessing variables from ClassA in package1
        System.out.println("ClassB - publicVar: " + publicVar);       // Accessible
        System.out.println("ClassB - protectedVar: " + protectedVar); // Accessible due to inheritance
        // System.out.println("ClassB - defaultVar: " + defaultVar);  // Not accessible (default)
        // System.out.println("ClassB - privateVar: " + privateVar);  // Not accessible (private)
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        System.out.println("Accessing from ClassB:");
        b.show(); // Display accessible variables in ClassB

        System.out.println("Accessing ClassA's public variables directly:");
        System.out.println("Direct access - publicVar: " + a.publicVar); // Accessible
        // System.out.println("Direct access - protectedVar: " + a.protectedVar); // Not accessible
        // System.out.println("Direct access - defaultVar: " + a.defaultVar); // Not accessible
        // System.out.println("Direct access - privateVar: " + a.privateVar); // Not accessible
    }
}
