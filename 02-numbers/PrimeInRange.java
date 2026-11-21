import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end: ");
        int start = sc.nextInt(), end = sc.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int n = start; n <= end; n++) {
            if (n < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(n + " ");
        }
        System.out.println();
        sc.close();
    }
}
