import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int a=0;
        int b=1;
        int ans=fibo(num,a,b);
        System.out.println(ans);
    }
    static int fibo(int dig,int c,int d){
        if(dig==0 ){
            System.out.println(c);
        }else if(dig==1){
            System.out.println(d);
        }
        for(int i=2;i<=dig;i++){
            int next=c+d;
            c=d;
            d=next;

        }

        return d;
    }
}
