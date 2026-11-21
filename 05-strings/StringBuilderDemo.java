public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, ",");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(5, 6);
        System.out.println(sb);
    }
}
