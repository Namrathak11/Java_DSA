import java.util.*;
public class Se {
    public static void main(String[] args) {
        int[] a={3,2,19,7,0,-8,-5,-2,0,-7,-4,-2,89,78};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int end=arr.length-i-1;
            int max=getmax(arr,0,end);
            swap(arr,max,end);
        }
    }
    static int getmax(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
