import java.util.*;
public class Mis2 {
    public static void main(String[] args) {
        int[] a={7,4,4,5,3,1,1,7};
        int[] ans=search(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Missing number is: "+Arrays.toString(ans));


    }
    static int[] search(int[] arr){
        for(int i=0;i<arr.length;){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[]{index+1};
            }
        }
        return new int[]{arr.length+1};
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
