package Arrays;
import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {
        // Ask the user for input
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // Check if the number is an Armstrong number
        strong(num);
    }

    static void strong(int rr) {
        int original = rr;  // Save the original number for later comparison
        int count = 0;

        // Calculate the number of digits
        int temp = rr;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        // Calculate the sum of the digits raised to the power of the number of digits
        int sum = 0;
        temp = rr;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);  // Add the power of the digit to the sum
            temp = temp / 10;  // Reduce the number by one digit
        }

        // Check if the sum equals the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

