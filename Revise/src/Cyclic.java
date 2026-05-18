import java.util.Arrays;
public class Cyclic {
    public static void main(String[] args){
        int[] a={2,3,1,5,4};
        search(a);
        System.out.println(Arrays.toString(a));

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
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
