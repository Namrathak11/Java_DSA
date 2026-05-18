package Practice;
import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        int[] a={5,4,2,1,3};
        search(a);
        System.out.println(Arrays.toString(a));

    }
    static void search(int[] a){
        boolean swap;
        for(int i=0;i<a.length;i++){
            swap=false;
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){

                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swap=true;
                    }
                }
            if(!swap){
                break;
            }
        }
    }
}

