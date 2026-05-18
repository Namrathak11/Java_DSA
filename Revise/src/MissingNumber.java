import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args){
        int[] a={0,4,2,3};
        int ans=search(a);
        System.out.println(Arrays.toString(a));
        System.out.println("missing no.is "+ ans);

    }
    static int search(int[] arr){
        int i=0;
        while(i<arr.length){
            int ex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[ex]){
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
