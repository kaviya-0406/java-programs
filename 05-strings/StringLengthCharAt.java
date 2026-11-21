public class StringLengthCharAt {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Length = " + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at " + i + " = " + str.charAt(i));
        }
    }
}
