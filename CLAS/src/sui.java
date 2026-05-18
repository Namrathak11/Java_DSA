import java.util.Arrays;
public class sui {
    public static void main(String[] args){
        int[] a={2,-4};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        for(int i=0;i<arr.length;i++){
            int end=arr.length-i-1;
            int getmax=max(arr,0,end);
            swap(arr,getmax,end);
        }
    }
    static int max(int[] arr,int start,int end){
        int temp=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[temp]){
                temp=i;
            }
        }
        return temp;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
