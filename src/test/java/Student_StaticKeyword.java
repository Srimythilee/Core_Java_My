public class Student_StaticKeyword {
    // Define and Explain Usage of Static Keyword -
        // The Static keyword is used to make a member belong to the class itself rather than to individual Objects. This means a static member is share by all instance of the class

    //Where we can use the static key word - static variable ,
        // - static method, static block , static in nested class

    static String Collegename = "REC";
    static String name;

    // Constructor
    Student_StaticKeyword(String name){
        this.name=name;
    }

    // Method

    void display(){
        System.out.println(name + " studied at: "+Collegename);
    }
    // Static method
    static void display1(){
        System.out.println(name + " studied at: "+Collegename);
    }

    static{
        // Static block is executed only once when the class is loaded
        System.out.println(name + " studied at: "+Collegename);
    }


    public static void main(String[] args) {

        Student_StaticKeyword s1 = new Student_StaticKeyword("Manoj");
        Student_StaticKeyword s2 = new Student_StaticKeyword("Mythili");
        s1.display();
        s2.display();
        display1();



    }
















}
