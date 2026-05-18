
import java.util.Scanner;
public class Hcf{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();

        int HCF=(a<b)? a:b;

        for(int i=HCF;i>=1;i--){
            if(a%i==0 && b%i==0){
                HCF=i;
                break;
            }
        }
        System.out.println("HCF IF: "+HCF);
        int LCM=(a*b)/HCF;
        System.out.println("LCM Is: "+LCM);
    }

}
