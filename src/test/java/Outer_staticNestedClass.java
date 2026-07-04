public class Outer_staticNestedClass {

    static class Inner {
        void method(){
            System.out.println("Inside the static nested class");
        }

    }


    static void main() {

        Outer_staticNestedClass.Inner obj = new Outer_staticNestedClass.Inner();
        obj.method();




    }










}
