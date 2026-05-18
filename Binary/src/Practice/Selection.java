package Practice;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1,0,-9,8,7,43};
        search(a);
        System.out.println(Arrays.toString(a));

    }

    static void search(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length -i-1;
            int max = getIndex(arr, 0, last);
            swap(arr,max,last);
        }
    }

    static int getIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
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