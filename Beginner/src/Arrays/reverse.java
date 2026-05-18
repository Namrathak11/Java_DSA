package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array: ");
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int[] a = new int[size];
        System.out.print("Enter the elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        rev(a);

        System.out.print("Reverse array is :");
            System.out.println(Arrays.toString(a));

    }
    static void rev(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] ar,int ind1,int ind2){
        int temp=ar[ind2];
        ar[ind2]=ar[ind1];
        ar[ind1]=temp;
    }

}
