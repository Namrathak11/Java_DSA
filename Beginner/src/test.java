public class test{
    public static void main(String[] args){
        System.out.println("Enter a number");
        int n=242424;
        int c=0;
        while(n>0) {
            int rem = n % 10;
        if(rem==1){
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
