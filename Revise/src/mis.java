import java.util.*;
public class mis {
    public static void main(String[] args) {
        int[] a={1,2,4,3};
        int ans=search(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Missing Number is "+ans);

    }
    static int search(int[] arr){
        for(int i=0;i<arr.length;){
            int index=arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length-1;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
