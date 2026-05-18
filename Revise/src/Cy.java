import java.util.*;
public class Cy {
    public static void main(String[] args) {
        int[] a={3,2,1,4,5};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length-1;){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
    }
}
