package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Now call the method from class A using object of class B
        A objA = new A(); // Upcasting B to A
        System.out.println(objA.meth());

        // Task 3: Create object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // Task 5: Call overridden method from obj of class B

    }
}