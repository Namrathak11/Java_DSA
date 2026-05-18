package namratha;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
//    Scanner in=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int n=in.nextInt();
//        boolean ans=(isprime(n));
//        System.out.println(ans);
        for(int i=2;i<=100;i++){
        if(isprime(i)) {
            System.out.print(i+" ");
        }
        }
    }
    static boolean isprime(int n){
        if(n<=0){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }
}
