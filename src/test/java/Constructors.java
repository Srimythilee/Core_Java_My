public class Constructors {

    // Constructor Is a Special Method to declare a variable
    // Constructor Types - Default Construcotr, Parameteriesed , Copy , Constructor Overloading

    int a;
    int b;

    Constructors(){
        System.out.println("Constructors");
    }

     Constructors(int a, int b){

        this.a =a;
        this.b = b;

        // Default Constructor - Constructor With No Parameter
        // Parameterised Constructor - Inside the Constructor Paranthesis - If i found or pass any variable or attribute That going to be a Parameterised constructor

        System.out.println("This is Constructors");
    }



    public static void main(String[] args) {
        Constructors obj = new Constructors(5,4);

    }



}
