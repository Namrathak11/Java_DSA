public class Palin {
    public static void main(String[] args) {
        String a="Malayalam";
        String b=a.toLowerCase();
        String rev="";

        for(int i=0;i<b.length();i++){
            rev+=b.charAt(i);
        }
        if(rev.equals(b)){
            System.out.println("It's a palindrome ");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}
