import java.util.Scanner;public class armStrong {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=in.nextInt();
        arm(num);

    }
    public static void arm(int armNum){
        int n=armNum;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+(int)Math.pow(rem,countDigits(armNum));
            n/=10;
        }
      if(ans==armNum){
          System.out.println("It is arm strong number");
      }
      else{
          System.out.println("It is not arm strong number");
      }
    }
    static int countDigits(int armNum){
        int count=0;
        while(armNum!=0){
            //int divisor=armNum%10;
            armNum/=10;
            count++;
          //  armNum/=10;
        }
        return count;
    }
}
