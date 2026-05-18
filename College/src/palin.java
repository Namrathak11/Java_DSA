public class palin {
    public static void main(String[] args) {
        if(args.length<1 || args.length>1){
            System.out.println("Enter valid input");
            return;
        }
        int a=Integer.parseInt(args[0]);
        int original=a;
        int rev=0;

       while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        if(original==rev){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");

        }
    }
}
