public class ThisKeyword {
    public static void main(String[] args) {
        Box b = new Box(10, 20);
        b.show();
    }
}

class Box {
    int width, height;

    Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void show() {
        System.out.println("Width = " + this.width + ", Height = " + this.height);
    }
}
