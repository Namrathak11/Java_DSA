import java.util.Scanner;
public class Prime2 {
    public static void main(String[] args) {
        int a=9;
        if(a<=1){
            System.out.println(a+" is not a prime number");
        }
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    System.out.println(a + " is not a prime number");
                    return;
                }
            }
                System.out.println(a + " is Prime Number");
        }
    }
}
