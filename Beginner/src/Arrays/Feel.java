package Arrays;

public class Feel {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int ans = search(a, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int aim) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==aim){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>aim){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]>aim){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

