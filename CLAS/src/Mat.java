
public class Mat {
    public static void main(String[] args) {
        if (args.length <=1) {
            System.out.println("Enter number");
        }

        int N=Integer.parseInt(args[0]);

        int[][] a=new int[N][N];
        int[][] b=new int[N][N];
        int[][] result=new int[N][N];

        System.out.println("Enter the elements of first matrix:");
        int index=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a[i][j]=Integer.parseInt(args[index++]);
            }
        }
        System.out.println("Enter the elements of second matrix:");
        int index1=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a[i][j]=Integer.parseInt(args[index1++]);
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println(result[i][j]+" ");
            }
        }
        System.out.println(" ");

    }
}
