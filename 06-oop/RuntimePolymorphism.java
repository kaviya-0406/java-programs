public class RuntimePolymorphism {
    public static void main(String[] args) {
        Pet p;
        p = new Cat();
        p.sound();
        p = new Cow();
        p.sound();
    }
}

class Pet {
    void sound() {
        System.out.println("Pet makes a sound");
    }
}

class Cat extends Pet {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Pet {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}
