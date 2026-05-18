package Arrays;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        arm(num);


    }
    static void arm(int n){
        int original=n;
        int sum=0;
        while(original>0){
            int rem=original%10;
            sum=(int)(sum+Math.pow(rem,count(n)));
            original=original/10;
        }
        if(sum==n) {
            System.out.println(n + " is an armstrong number");
        }
        else{
            System.out.println(n+"is not an armstrong number");
        }
    }
    static int count(int ni){
        int c=0;
        while(ni!=0){
            ni=ni/10;
            c++;
        }
        return c;
    }
}
