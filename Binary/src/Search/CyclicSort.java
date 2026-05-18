package Search;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] a={6,7,5,4,3,1,2};
        search(a);
        System.out.print(Arrays.toString(a));

    }
    static void search(int[] arr){
        int i=0;
        while(i<arr.length){
            int ex=arr[i]-1;
            if(arr[i]!=arr[ex]){
                swap(arr,i,ex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
