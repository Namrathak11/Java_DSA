package Arrays;

import javax.swing.*;

public class Kunal {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11};
        int target=13;
        int ans=bin(a,target);
        System.out.println(ans);
    }
    static int bin(int[] arr,int aim){
        int start=0;
        int end=arr.length-1;
        if(aim>arr.length-1){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==aim){
                return arr[mid];
            }
            if(aim<arr[mid]){
                end=mid-1;
            }else {
                start = mid + 1;
            }
        }
        return start;

    }
}
