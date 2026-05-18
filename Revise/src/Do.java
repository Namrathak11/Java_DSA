
import java.util.*;
public class Do{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5};
        int[] ans=search(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Duplicate Number is "+Arrays.toString(ans));

    }
    static int[] search(int[] arr){
        for(int i=0;i<arr.length;){
            int index=arr[i]-1;         //if(arr[index]!=index+1){
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

