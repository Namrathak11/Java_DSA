import java.util.Arrays;
public class SortedBS {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40},
                {11,25,35,45},
                {28,24,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(Sorted(matrix,37)));

    }
    public static int[] Sorted(int[][] arr,int target){
        int r=0;
        int col=arr.length-1;
        while(r<arr.length && col>=0){
            if(arr[r][col]==target){
                return new int[]{r,col};
            }
            if(arr[r][col]<target){
                r++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
