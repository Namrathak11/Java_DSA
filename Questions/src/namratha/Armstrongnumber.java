package namratha;
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n=in.nextInt();
//        boolean ans=Arm(n);
//        System.out.println(ans);
        for(int i=100;i<1000;i++) {
            if (Arm(i)) {
                System.out.println(i);
            }
        }


    }
    static boolean Arm(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;

        }
        return sum == original;
    }
}
