package Practice;
import java.util.*;

public class Sel {
   public static void main(String[] args){
        int[] a={5,4,2,1,0,-22,-33,-11,50,60};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int end=arr.length-i-1;
            int getIndex=LargeIndex(arr,0,end);

            swap(arr,getIndex,end);
        }
    }
    static int LargeIndex(int[] arr,int start,int end){
        int max=start;

        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int Second){
        int temp=arr[Second];
        arr[Second]=arr[first];
        arr[first]=temp;
    }

}
