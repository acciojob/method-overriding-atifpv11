package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // This will print the overridden method from class B
        // Task 5: Call the overridden method from obj of class B
        // Since the method is overridden in class B, the overridden version will be called
    }
}