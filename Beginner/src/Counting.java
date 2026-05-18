import java.util.Scanner;
public class Counting{
    public static void main(String[] args) {
        int a=123456789;
        int count=0;
        while(a>0){
            int rem=a%10;
            a=a/10;
            count=count*10+rem;
            count++;
        }
        System.out.println(count);




    }

}