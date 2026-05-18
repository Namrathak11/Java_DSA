package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        int[] a={1,2,4,4,4,4,5,6,7,8};
        int target=4;
        int start=search(a,target,true);
        int end=search(a,target,false);

        System.out.println(start);
        System.out.println(end);

    }
    static int search(int [] arr,int aim,boolean isstartoasc){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>aim){
                end=mid-1;
            }
            else if(arr[mid]<aim){
                start=mid+1;
            }
            else{
                ans=mid;
                if(isstartoasc){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }

        }
        return ans;

    }
}