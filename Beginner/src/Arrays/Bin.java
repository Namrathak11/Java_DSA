package Arrays;

public class Bin {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int target=7;
        int ans= ary(a,target);
        System.out.println(target+" Found at index "+ ans);
    }
    static int ary(int[] arr,int aim){
        int start=0;
        int end=arr.length-1;
        int mid=start+end/2;
        if(arr[mid]==aim){
           return mid;
        }
        if(aim>mid){
            for(int i=mid+1;i<arr.length;i++){
                if(arr[i]==aim){
                    return i;
                }
            }
        }
        if(aim<mid){
            for(int i=0;i<mid;i++){
                if(arr[i]==aim){
                    return i;
                }
            }
        }

        return -1;

    }
}
