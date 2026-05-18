import java.util.Arrays;
import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] he = new int[5];
        System.out.print("Enter the number");
        for (int i = 0; i < he.length; i++){
           he[i]=in.nextInt();

        }
        System.out.println(Arrays.toString(he));

    }
}
