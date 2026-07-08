public class student{

    void method1(){

        System.out.println("Hey I am from first method");


    }

    void method2(){
         System.out.println("Hey I am from second method");


    }


}

class maino {

    public static void main(String[] args) {
        
        student stu = new student();
        stu.method1();
    }
}