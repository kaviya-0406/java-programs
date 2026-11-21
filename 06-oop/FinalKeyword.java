public class FinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("PI = " + PI);
        new Base().display();
    }
}

class Base {
    final void display() {
        System.out.println("This method cannot be overridden");
    }
}
