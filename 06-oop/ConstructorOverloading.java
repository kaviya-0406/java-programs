public class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("Area 1: " + new Rectangle().area());
        System.out.println("Area 2: " + new Rectangle(5).area());
        System.out.println("Area 3: " + new Rectangle(4, 6).area());
    }
}

class Rectangle {
    int length, width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(int side) {
        length = side;
        width = side;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }
}
