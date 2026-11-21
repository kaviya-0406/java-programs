public class SubstringDemo {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        System.out.println("substring(0, 7): " + str.substring(0, 7));
        System.out.println("indexOf('J'): " + str.indexOf('J'));
        System.out.println("charAt(3): " + str.charAt(3));
        System.out.println("contains(\"Java\"): " + str.contains("Java"));
        System.out.println("replace: " + str.replace("Java", "World"));
    }
}
