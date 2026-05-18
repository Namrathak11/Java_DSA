import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(Matrixsort(matrix,16)));

    }
    public static int[] Matrixsort(int[][] arr,int target){
        int m=arr.length;
        int n=arr[0].length;
        int start=0;
        int end=m*n-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            int midValue=arr[mid/n][mid%n];

            if(midValue==target){
                return new int[]{mid/n,mid%n};
            }
            else if(midValue<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
