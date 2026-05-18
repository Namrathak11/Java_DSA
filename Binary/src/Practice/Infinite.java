package Practice;
import java.util.Scanner;

public class Infinite {
    public static void main(String[] args){
        System.out.print("Enter a size of array:");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] a=new int[size];
        System.out.print("Enter the elements of an array:");
        for(int i=0;i <size ;i++){
            a[i]=in.nextInt();
        }
        System.out.print("Enter the target element to search:");
        int target=in.nextInt();
        int ans=search(a,target);
        System.out.println(target+"Found at index: "+ans);
    }
    static int search(int[] arr,int aim){
        int start=0;
        int end=1;

        while(aim>arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        int an= bin(arr,aim,start,end);
        return an;
    }
    static int bin(int [] ar,int aim,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid]==aim){
                return mid;
            }
            else if(ar[mid]>aim){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
