public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming";
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " = " + count[i]);
            }
        }
    }
}
