public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 2};
        boolean[] printed = new boolean[arr.length];
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            if (printed[i]) continue;
            boolean dup = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dup = true;
                    printed[j] = true;
                }
            }
            if (dup) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
