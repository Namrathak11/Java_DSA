import java.util.Arrays;
public class SEA {
    public static void main(String[] args){
        int[] a={4,2,1,3,7,6,5};
        search(a);
        System.out.println(Arrays.toString(a));
    }
    static void search(int[] arr){
        for(int i=1;i<arr.length;){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
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
