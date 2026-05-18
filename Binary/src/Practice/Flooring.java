package Practice;

public class Flooring {
    public static void main(String[] args) {
        int[] a = {4,8,12,16,20,24};
        int target = 23;
        int ans = search(a, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int aim) {
        int start = 0;
        int end = arr.length - 1;

        if(aim>arr[end] || aim<arr[start]){
            return -1;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==aim){
                return arr[mid];
            }
            if(arr[mid]>aim){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return arr[end];
    }
}

