import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest = " + (p * r * t) / 100);
        sc.close();
    }
}
