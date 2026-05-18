package Practice;
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args){
        System.out.print("Enter a number:");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        if(num==0){
            System.out.println("Fibonacci Series is: "+a);
            return;
        }else if(num==1){
            System.out.println("Fibonacci series is: "+b);
            return;
        }
        System.out.print("Fibonacci series of is:");
        for(int i=1;i<=num;i++){
            System.out.print(b+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(" ");

    }
}
