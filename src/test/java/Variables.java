// Define Variables - In Java, a Variable is a named storage location used to hold data that can be used and modified duting Execution
// Types Of variables - Local Variabe, Instance Variables, Static Veriable

// 1. Local Variable - Declare Inside the Method Or Block

class localvariable {

    void method1(){

        System.out.println("Hey i am text from method1");

    }
        
    void method2(){
        System.out.println("Hey i am text from method2");

    }

}

public static void main(String[] args) {

    localvariable loc = new localvariable();
    loc.method1();

}


// 2. Instance Variable - Declared inside a class but outside the method

// 3. Static Variable - Shared By all Objects


