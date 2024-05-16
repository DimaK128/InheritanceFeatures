package com.example.inheritancefeatures;

// 2.1.1. Create superclass
class SuperClass {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    public void display() {
        System.out.println("Inside SuperClass");
    }
}

// 2.1.8. Declare abstract class
abstract class MyAbstractClass {
    abstract void abstractMethod();
}

// 2.1.8. Implement abstract method
class SubClass extends SuperClass {
    // 2.1.8. Implement abstract method
    void abstractMethod() {
        System.out.println("Abstract method implemented");
    }

    // 2.1.3. Access superclass instance variables
    void accessVariables() {
        // Explanation: privateVar is not accessible directly because it's declared as private
        // System.out.println("Private variable in SuperClass: " + privateVar);
        System.out.println("Protected variable in SuperClass: " + protectedVar);
        System.out.println("Public variable in SuperClass: " + publicVar);
    }

    // 2.1.4. Overloaded methods
    void overloadedMethod() {
        System.out.println("Overloaded method in SubClass");
    }

    void overloadedMethod(int num) {
        System.out.println("Overloaded method in SubClass with parameter: " + num);
    }

    // 2.1.5. Override methods
    @Override
    public void display() {
        System.out.println("Inside SubClass");
    }

    // 2.1.6. Use of super keyword
    void callSuperMethod() {
        super.display(); // Calling overridden method of superclass
    }

    // 2.1.7. Use of super keyword for parent constructor call
    SubClass() {
        super(); // Calling superclass constructor
    }

    SubClass(int num) {
        super(); // Calling superclass constructor
        System.out.println("Non-default constructor in SubClass: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        // 2.1.2. Create subclass
        SuperClass a = new SubClass();
        // This is possible because the subclass inherits all the members of its superclass.

        // 2.1.2. Print result of getClass()
        System.out.println("Class of instance 'a': " + a.getClass());

        // 2.1.3. Access superclass instance variables inside child class methods
        SubClass sub = new SubClass();
        sub.accessVariables();

        // 2.1.4. Call overloaded methods
        SubClass subClass = new SubClass();
        subClass.overloadedMethod();
        subClass.overloadedMethod(5);

        // 2.1.5. Call overridden method
        SubClass subClass1 = new SubClass();
        subClass1.display(); // Calls overridden method

        // 2.1.6. Use of super keyword
        SubClass subClass2 = new SubClass();
        subClass2.callSuperMethod(); // Calls superclass method

        // 2.1.7. Use of super keyword for parent constructor call
        SubClass subClass3 = new SubClass(10); // Calls non-default superclass constructor
    }
}
