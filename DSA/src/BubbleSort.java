import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={6,7,8,1,2,3};
        Bubble(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

    }
}
