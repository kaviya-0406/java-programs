public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 40;
        int low = 0, high = arr.length - 1, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (index != -1) System.out.println(key + " found at index " + index);
        else System.out.println(key + " not found");
    }
}
