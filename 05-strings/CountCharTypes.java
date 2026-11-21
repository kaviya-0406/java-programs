public class CountCharTypes {
    public static void main(String[] args) {
        String str = "Java 17 is #1!";
        int letters = 0, digits = 0, spaces = 0, others = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (c == ' ') spaces++;
            else others++;
        }
        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("Spaces = " + spaces);
        System.out.println("Special characters = " + others);
    }
}
