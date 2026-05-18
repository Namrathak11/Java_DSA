public class InfinteSearch {
    public static void main(String[] args){
        int[] a={4,5,6,7,8,9};
        int target=9;
        int ans=search(a,target);
        System.out.print("Element found at: "+ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
                int temp=end+1;
                end=end+(end-start+1)*2;
                start=temp;

            }
        return bin(arr,target,start,end);
        }

    static int bin(int[] arr,int aim,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==aim){
               return mid;
            }
            else if(arr[mid]<aim){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
