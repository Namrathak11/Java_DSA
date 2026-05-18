import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        System.out.print("Enter a word : ");
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        a=a.toLowerCase();
        String rev="";

        for(int i=a.length()-1;i>=0;i--){
            rev+=a.charAt(i);

        }
        System.out.println(rev);
        if(a.equals(rev)){
            System.out.println("It's a Palindrome");
        }
        else{
            System.out.println("It's not a Palindrome:");
        }
    }

}
