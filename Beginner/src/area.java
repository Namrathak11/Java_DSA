import java.util.Scanner;
//import java.lang.Math;
public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("before swapping:a="+a+" b="+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping:a=" +a +" b="+b);
//        System.out.println("after swapping:" +b);
    }
}