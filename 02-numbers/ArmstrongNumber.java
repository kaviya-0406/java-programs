import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digits = String.valueOf(num).length();
        int temp = num, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits);
            temp /= 10;
        }
        System.out.println(num + (sum == num ? " is an Armstrong number" : " is not an Armstrong number"));
        sc.close();
    }
}
