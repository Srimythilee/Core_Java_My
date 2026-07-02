// Rule 1 - You can create mutiple class in the maven file


// Rule 2 - You can create one main method inside the class


// Rule 3 - You can create Main method ouside of the classes too
// Rule 4 - User can create the nested classes with in single file
// Rule 5 - User can create n number of method inside the class which declared
// Rule 6 - You can create only one main method Inside the class which you created
// Rule 7 - If you want to access the one method from one class file to another class file - Instant need to be created
// Rule 8 - All the code should be endup with semicolon (Not class syntax or method sysntex)





class anbu{

    void method1(){
        System.out.println("I am from classname class method1");//

    }
    void method12(){
        
      System.out.println("I am from classname class method12");
    }

    public static void main(String[] args) {

        anbu Onj = new anbu();
        Onj.method1();

        
        
    }

}

class classname1{

    public static void main(String[] args) {
        anbu an = new anbu();
        an.method1();
        
    }

}



class mythili{

    // n number of method can be used in a class
    // Only one main method should be there with in the class

    public Object method1;

    void method1(){

        System.out.println("Hey i am a method from No return type No Argument or no parameterized");

    }

    void method2(int a, int b){
        System.out.println("Hey I am the method from No Return type Perameterised");

    }

    int method3(){

        return 0;
    }

    int method4(float a, int b){

        return 0;
    }

    public static void main(String[] args) {
        mythili Obj = new mythili();
        Obj.method1();
        Obj.method2(0, 0);
        Obj.method3();
        Obj.method4(0.0f, 0);

    }
}




