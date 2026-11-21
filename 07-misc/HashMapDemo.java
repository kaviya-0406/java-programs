import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Arun");
        map.put(2, "Bala");
        map.put(3, "Chitra");
        System.out.println("Map: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
