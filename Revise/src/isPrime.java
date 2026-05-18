public class isPrime {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean prime(int i){
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
