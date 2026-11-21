public class ShapeAreas {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Square(4)};
        for (Shape s : shapes) {
            System.out.println("Area = " + s.area());
        }
    }
}

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }
}
