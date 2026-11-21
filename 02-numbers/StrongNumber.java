import java.util.Scanner;

public class StrongNumber {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        System.out.println(num + (sum == num ? " is a Strong number" : " is not a Strong number"));
        sc.close();
    }
}
