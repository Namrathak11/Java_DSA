import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {
        int[] a={5,3,3,2,1,4};
        int ans=search(a);
        System.out.println(Arrays.toString(a));
        System.out.print("Duplicate number is: "+ans);

    }
    static int search(int[] arr){
        int i=0;
        while(i<arr.length){
            int count=arr[i]-1;
            if(arr[i]!=arr[count]){
                swap(arr,i,count);
            }
            else{
                i++;
            }
        }
        for(int index =0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return arr[index];
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
