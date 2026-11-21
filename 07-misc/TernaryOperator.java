public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max = " + max);
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " is " + result);
    }
}
