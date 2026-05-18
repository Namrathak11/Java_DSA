package Search;

public class Cealingandwrap {
    public static void main(String[] args) {
        String[] a={"c","d","e","f"};
        String target="g";
        String ans=bin(a,target);
        System.out.println(ans);
    }
    static String bin(String[] arr,String aim){
        int start=0;
        int end=arr.length-1;
       // if(aim>arr[arr.length-1]){
         //   return -1;
        //}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(aim.compareTo(arr[mid])<0){
                end=mid-1;
            }else if(aim.compareTo(arr[mid])>0){
                start = mid + 1;
            }
            else{
                    return arr[mid];
                }
            }
        return arr[start%arr.length];
        }
    }

