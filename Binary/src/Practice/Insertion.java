package Practice;
import java.util.*;

public class Insertion {
    public static void main(String[] args){
        int[] a={4,3,2,1,5,6};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
