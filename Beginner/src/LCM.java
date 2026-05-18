import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int Lcm = (a > b) ? a : b;
        while (true) {
            if(Lcm%a==0 && Lcm %b==0){
                break;
            }
            Lcm++;
        }
        System.out.println(Lcm);

    }
}
