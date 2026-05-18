import java.util.Scanner;
public class Nacc {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        if(num==0){
            System.out.println(a);
        }else if(num==1){
            System.out.println(b);

        }
        for(int i=2;i<=num;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
    }

}
