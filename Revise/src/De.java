import java.util.Arrays;
public class De {
    public static void main(String[] args) {
        int[] a={4,5,3,2,1};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] arr){
        boolean isASC;
        for(int i=0;i<arr.length;i++){
            isASC=false;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isASC=true;
                }
            }
            if(isASC!=true){
                break;
            }
        }
    }
}
