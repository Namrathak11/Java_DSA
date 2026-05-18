import java.util.Arrays;

public class Linear2D {
    public static void main(String[] args) {
        int[][] a={{1,4,2},
                {2,4,2},
                {5,6,7}
        };
        int target=0;
        int[] ans=line(a,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] line(int[][] arr, int dest){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==dest){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};


    }
}
