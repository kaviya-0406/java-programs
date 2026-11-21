public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;
        int b = obj;
        System.out.println("Autoboxing: " + obj);
        System.out.println("Unboxing: " + b);

        int num = Integer.parseInt("123");
        System.out.println("Parsed: " + (num + 1));
        System.out.println("Max int: " + Integer.MAX_VALUE);
    }
}
