package com.example.inheritancefeatures;

// 2.1.1. Create superclass (base class / parent class)
class SuperClass {
    // 2.1.3. Instance variables with different access modifiers
    private int privateVar;
    protected String protectedVar;
    public double publicVar;

    // Constructor
    public SuperClass(int privateVar, String protectedVar, double publicVar) {
        this.privateVar = privateVar;
        this.protectedVar = protectedVar;
        this.publicVar = publicVar;
    }
}

// 2.1.8. Declare abstract class
abstract class MyAbstractClass {
    // Abstract method
    abstract void abstractMethod();
}

// 2.1.1. Create subclass (child class) which inherits the superclass
class SubClass extends SuperClass {
    // Constructor
    public SubClass(int privateVar, String protectedVar, double publicVar) {
        super(privateVar, protectedVar, publicVar); // 2.1.7. Call superclass constructor using super()
    }

    // 2.1.4. Overloaded methods
    void overloadedMethod() {
        System.out.println("Inside SubClass's overloadedMethod()");
    }

    void overloadedMethod(int num) {
        System.out.println("Inside SubClass's overloadedMethod(int num)");
    }

    // 2.1.5. Overridden methods
    @Override
    void overriddenMethod() {
        System.out.println("Inside SubClass's overriddenMethod()");
    }

    // 2.1.6. Use of super keyword to call overridden method
    @Override
    void overriddenMethod() {
        super.overriddenMethod();
        System.out.println("Inside SubClass's overriddenMethod()");
    }

    // 2.1.8. Implement abstract method
    @Override
    void abstractMethod() {
        System.out.println("Inside SubClass's abstractMethod()");
    }
}

public class Main {
    public static void main(String[] args) {
        // 2.1.2. Create an instance of the subclass
        SuperClass a = new SubClass(10, "Hello", 3.14);

        // 2.1.3. Demonstrate accessing superclass instance variables
        // System.out.println(a.privateVar); // Error: privateVar has private access in SuperClass
        System.out.println(a.protectedVar); // OK: Protected access allows access within subclass
        System.out.println(a.publicVar); // OK: Public access allows access from any class

        // 2.1.3. Demonstrate explanation when no access to superclass member
        // System.out.println(a.privateVar); // Error: privateVar has private access in SuperClass

        // 2.1.4. Call overloaded methods
        SubClass b = new SubClass(20, "World", 6.28);
        b.overloadedMethod();
        b.overloadedMethod(5);

        // 2.1.5. Call overridden method
        a.overriddenMethod(); // Calls SubClass's overriddenMethod()

        // 2.1.6. Use of super keyword to call overridden method
        b.overriddenMethod();

        // 2.1.8. Demonstrate abstract classes and methods
        b.abstractMethod();
    }
}
