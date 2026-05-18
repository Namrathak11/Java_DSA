import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] fir = new int[5];

        for (int i = 0; i < fir.length; i++) {
            fir[i] = in.nextInt();
            // System.out.print(fir[i]+" ");
        }
        System.out.print(Arrays.toString(fir));
    }
}