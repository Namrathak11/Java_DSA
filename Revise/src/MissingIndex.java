import java.util.Arrays;
public class MissingIndex {
    public static void main(String[] args){
        int[] a={2,1,3,3,3,0,0};
        int miss=search(a);
        System.out.println(Arrays.toString(a));
        System.out.print("Missing number is: "+miss);

    }
    static int search(int[] arr){
        int i=0;
        while(i<arr.length){
            int ex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[ex]){
                swap(arr,i,ex);
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
        //case 2:where Number not in an array Like if:
        //n=4 but array is[1,0,2,3] then return n which is arr.length;
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
