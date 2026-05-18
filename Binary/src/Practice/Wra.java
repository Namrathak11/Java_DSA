package Practice;

public class Wra {
    public static void main(String[] args) {
        int[] a = {4,8,12,16,20,24};
        int target = 20;
        int ans = search(a, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int aim) {
        int start = 0;
        int end = arr.length - 1;


        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>aim){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}

