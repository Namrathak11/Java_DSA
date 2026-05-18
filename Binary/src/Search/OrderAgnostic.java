package Search;
import java.util.*;

public class OrderAgnostic {
    public static void main(String[] args){
       System.out.print("Enter size of an array:");
       Scanner in=new Scanner(System.in);
       int size=in.nextInt();
       int[] a=new int[size];
       System.out.print("Enter the elements of an array:");
       for(int i=0;i<=a.length-1;i++){
           a[i]=in.nextInt();
       }
       System.out.print("Enter the target element:");
       int target=in.nextInt();
       int ans=search(a,target);
       System.out.println(target+" found at "+" index "+ ans);
    }
    static int search(int[] arr,int aim){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;

            if(aim==arr[mid]){
                return mid;
            }
            if(isAsc) {
            if (aim < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (aim < arr[mid]) {
                    start=mid+1;
                } else {
                    end=mid-1;
                }
              }

            }
        return -1;
        }
    }

