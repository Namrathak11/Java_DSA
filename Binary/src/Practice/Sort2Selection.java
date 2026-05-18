package Practice;
import java.util.Arrays;

public class Sort2Selection {
    public static void main(String[] args){
        int[] a={8,9,5,3,2,0,1};
        Core(a);
        System.out.println(Arrays.toString(a));


    }
    static void Core(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;

            int LargeIndex=getindex(arr,0,last);
            swap(arr,LargeIndex,last);
        }
    }
    static int getindex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
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
