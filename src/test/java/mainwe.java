class defaultconstructorsJava {

    defaultconstructorsJava(){

        System.out.print("constructorsJava");
    }


    public static void main(String[] args) {
        // Explain the main methodis
        System.out.println("This is default constructorsJava");

    }
}

// No Argument constructor

class NoArgumentConstructor{
    NoArgumentConstructor(){
        System.out.print("NoArgumentConstructor");
    }
    public static void main(String[] args) {
        System.out.println("This is a No Argument constructor");

    }
}

// Paramenterised Concstructor

class parameterisedconstructor{

    int id;
    String name;

    parameterisedconstructor(int id, String name){
        this.id = id;
        this.name = name;

    }
    void display(){
        System.out.println("display");

    }

}



public class mainwe{


    public static void main(String[] args) {

        parameterisedconstructor param = new parameterisedconstructor(789, "Mythili");
        param.display();
        parameterisedconstructor param2 = new parameterisedconstructor(789, "Anbu");
        param2.display();


    }



}


