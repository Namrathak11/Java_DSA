import java.util.Scanner;
public class Lea {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();
        if((year%4==0&&year%10!=0)||(year%400==0)){
            System.out.println(year+" is an Leap year ?"+ " true");
        }
        else{
            System.out.println(year+" is an Leap year ?"+ " false");
        }
    }
}
