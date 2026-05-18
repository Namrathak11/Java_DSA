package Practice;
import java.util.Arrays;

public class Sorted2D {
    public static void main(String[] args){
        int[][] a= {{1,2,3,4},
                {11,22,33,44},
                {111,222,333,444},
        };
        int target=444;
        System.out.println(Arrays.toString(search(a,target)));

    }
    static int[] search(int[][] arr,int aim){
        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==aim){
                return new int[]{row,col};
            }
            else if(arr[row][col]>aim){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
