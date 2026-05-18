package Practice;
import java.util.*;

public class Bob {
    public static void main(String[] args){
        int [] a={6,7,8,1,0};
        search(a);
        System.out.println(Arrays.toString(a));


    }
    static void search(int[] arr){
        boolean isSor;
        for(int i=0;i<arr.length-1;i++){
            isSor=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSor=true;

                }
            }
            if(!isSor){
                break;

            }
        }
    }
}