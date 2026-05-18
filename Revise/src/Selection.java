import java.util.*;

public class Selection {
    public static void main(String[] args){
        int[] a={-9,0,3,5,6,7,1,2,3,-8,-10};
        search(a);
        System.out.print(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int end=arr.length-i-1;
            int getmax=maxindex(arr,0,end);
            swap(arr,getmax,end);
        }
    }
    static int maxindex(int[] arr,int start ,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;

    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
    }
}
