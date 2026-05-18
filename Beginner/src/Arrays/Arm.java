package Arrays;
import java.util.Scanner;
import java.math.*;

public class Arm {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();

        strong(num);

    }

    static void strong(int armNum) {
        int original = armNum;
        int sum = 0;
        int wor = armNum;
        while (wor > 0) {
            int digit = wor % 10;
            sum += (int) (Math.pow(digit, count(armNum)));
            wor /= 10;
        }

        if (sum==original) {
                System.out.println(original+" is an armstrong number");
            }
        else{
                System.out.println(original+" is not an armstrong number");
            }
        }
        static int count(int armNum){
            int count = 0;
            int wor = armNum;
            while (wor > 0) {
                wor = wor / 10;
                count++;
            }
            return count;
        }
    }

