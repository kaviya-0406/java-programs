public class SuperKeyword {
    public static void main(String[] args) {
        new Son().show();
    }
}

class Father {
    String name = "Father";

    void show() {
        System.out.println("This is the father class");
    }
}

class Son extends Father {
    String name = "Son";

    void show() {
        super.show();
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
    }
}
