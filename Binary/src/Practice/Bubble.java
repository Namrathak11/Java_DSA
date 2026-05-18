package Practice;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args){
        int[] a={5,3,4,2,1,0};
        Bub(a);
        System.out.println(Arrays.toString(a));

    }
    static void Bub(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
