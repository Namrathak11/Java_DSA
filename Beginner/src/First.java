import java.util.Scanner;
public class First{
    public static void main(String[] args){
        System.out.println("Enter three numbers");
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int large=0;

        if(large==a || large==b || large==c){
            System.out.println("largets number is :" +large);
        }
        else if(a>b && a>c){
            System.out.println("largest Number is: "+ a);
        }
        else if(b>a && b>c){
            System.out.println("largest Number is: " +b);
        }
        else{
            System.out.println("largest Number is: " +c);
        }
    }
}