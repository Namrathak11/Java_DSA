package Practice;
import java.util.Arrays;
public class Linear2D {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {33, 23, 77, 89, 0},
                {24, 78, 90, 11},
        };
        int target = 5;
        System.out.println(Arrays.toString(search(a,target)));

    }

    static int[] search(int[][] arr, int aim) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++) {
                if (arr[i][j] == aim) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }
}
