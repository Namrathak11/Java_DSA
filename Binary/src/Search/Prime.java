package Search;

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
        }
    }
}
