public class thiskeyword {

    // this - This keyword is a reference to the current object of the class, It is used to distinguish the current Objects member from local variables or to invoke the constructor or method
    // Refer to the current Objects Instantce variable
    // Variable - this
    // Method - this
    // Construcotr - this --> Call Another Constructor in the same class
    // pass the current object as an argument
    // This key word canot used in the static variable, class, method - Becuase static methods not belongs to the specfic object
    // Why do we write this.name = name ?

    int a;

    thiskeyword(){
//        this.a = a;
        this(10);
    }
    thiskeyword(int x){
        System.out.println("Perameterised Constructor");
    }



    void method(int i){

    }
    void method33(){
        System.out.println("this void method with perameterised No Return type");

        this.method(10);// call the current classes method


    }


    static void main() {

        thiskeyword obj = new thiskeyword();
        obj.method(10);

    }
}
