import java.util.*;
public class Bob {
    public static void main(String[] args) {
        int[] a={4,3,2,1,5,6,8,9,-9,-7,-1};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        boolean isAsc;
        for(int i=0;i<arr.length-1;i++){
            isAsc=false;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isAsc=true;
                }
            }
            if(!isAsc){
                break;
            }
        }
    }
}
