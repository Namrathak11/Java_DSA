package Practice;
import java.util.*;

public class Wheel {
    public static void main(String[] args){
        int[] a={4,2,1,5,3,0,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i];
            if(arr[index]!=arr[i]){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }

        }
    }
}
