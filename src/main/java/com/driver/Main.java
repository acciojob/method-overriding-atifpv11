package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B
        B objB = new B();
        A objA = new A();

        // Task 3: Call method meth of class A using the object of class B
        System.out.println(objA.meth()); // This will print "Invoking method from class A"

        // Task 5: Call the overridden method from obj of class B
        System.out.println(objB.meth()); // This will print "Method is overridden in Extended class B"
    }
}