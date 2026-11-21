public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
