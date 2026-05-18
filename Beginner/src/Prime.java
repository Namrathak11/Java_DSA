import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int m=a%2;
        if(a==0 || a==1){
            System.out.println(a+" is not a prime number");
        }
        else if(m==0){
            System.out.println(a+" is not prime number");
        }
        else{
            System.out.println(a+" is a Prime Number");
        }
    }
}
