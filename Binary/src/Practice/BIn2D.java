package Practice;

import java.util.Arrays;

public class BIn2D {
    public static void main(String[] args){
        int[][] a={{1,2,3,4},
                 {11,22,33,44},
                {111,222,333,444},
                {555,666,777,888}
        };
        int aim=888;
        System.out.println(Arrays.toString(search(a,aim)));

    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;

       while(row<arr.length && col>=0){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
                else if(arr[row][col]>target){
                    col--;
                }
                else{
                    row++;
                }
          }
       return new int[]{-1,-1};
    }
}
