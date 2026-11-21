public class StringCompare {
    public static void main(String[] args) {
        String a = "Java";
        String b = "java";
        System.out.println("equals: " + a.equals(b));
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b));
        System.out.println("compareTo: " + a.compareTo(b));
    }
}
