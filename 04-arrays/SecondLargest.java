public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Second largest = " + second);
    }
}
