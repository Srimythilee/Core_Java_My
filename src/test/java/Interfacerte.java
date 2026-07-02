interface Animal {

    void sound();

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog sound");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }
}

// An interface in Java is a blueprint of a class that contains method declarations
// (and constants, if any). A class implements an interface by providing the
// implementation of all its abstract methods.