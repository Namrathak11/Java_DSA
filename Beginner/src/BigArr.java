import java.util.*;
public class BigArr {
    public static void main(String[] args){
        int[] b=new int[]{2,209,123,224,23,41,321};
        big(b,1,4);



    }
    static void big(int[] arr,int a,int b){
        int Big=arr[0];
        for(int i=a;i<b;i++){

            if(arr[i]>Big){
                Big=arr[i];
            }

        }
        System.out.println(Big);


    }
}
