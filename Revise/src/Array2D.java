import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an size of row in an array:");
        int row = in.nextInt();
        System.out.print("Enter an size of column in an array:");
        int col = in.nextInt();
        int[][] a = new int[row][col];
        System.out.print("Enter the elements of an array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(in.hasNextInt()) {
                    a[i][j] = in.nextInt();
                }
            }
        }
        System.out.println();

        for(int i=0;i<row;i++){
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println();

        System.out.print("Enter the element to be searched:");
        int aim = in.nextInt();

        System.out.println();

        int[] ans=search(a,aim);
        System.out.print("Element found at: ");
        System.out.print(Arrays.toString(ans));
    }



    static int[] search(int[][] arr,int aim){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==aim){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}


