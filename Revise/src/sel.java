import java.util.*;
public class sel {
    public static void main(String[] args){
        int[] a={};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int end=arr.length-i-1;
            int max=maxi(arr,0,end);
            swap(arr,max,end);
        }
    }
    static int maxi(int[] arr,int start,int end){
        int mux=start;
        for(int i=start;i<=end;i++){
            if(arr[mux]<arr[i]){
                mux=i;
            }
        }
        return mux;

    }

    static void swap(int[] arr,int first,int last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
    }
}
