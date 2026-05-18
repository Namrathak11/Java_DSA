package Practice;

public class Palin {
    public static void main(String[] args) {
        String a="leveL";
        a=a.toLowerCase();
        String rev="";

        for(int i=a.length()-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        if (a.equals(rev)) {
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a palindrome;");
        }

    }
}
