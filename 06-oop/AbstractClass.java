public class AbstractClass {
    public static void main(String[] args) {
        new Round().show();
        new Rect().show();
    }
}

abstract class Figure {
    abstract double area();

    void show() {
        System.out.println("Area = " + area());
    }
}

class Round extends Figure {
    double r = 7;

    double area() {
        return Math.PI * r * r;
    }
}

class Rect extends Figure {
    double l = 5, b = 4;

    double area() {
        return l * b;
    }
}
