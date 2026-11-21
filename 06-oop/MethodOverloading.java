public class MethodOverloading {
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(2.5, 3.5));
    }
}

class Adder {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
