import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] no=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(no));
        change(no,1,3);
        System.out.println(Arrays.toString(no));
    }
    static void change(int[] arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }
}
