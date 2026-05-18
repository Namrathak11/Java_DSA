package Arrays;
public class Ceiling {
    public static void main(String[] args) {
        int[] a={5,6,8,9,10,12,13,14};
        int target=14;

        int ans=Sear(a,target);
        System.out.println(ans);


    }
    static int Sear(int[] arr,int aim){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];


        while(start<end) {
            int mid = start + (end - start) / 2;


            if (isAsc) {
                if (arr[mid] > aim) {
                    end = mid - 1;

                } else  {
                    start = mid + 1;

                }
            } else {
                if (arr[mid] > aim) {
                    start = mid + 1;
                } else {

                    end = mid - 1;
                }
            }
            }
        return arr[start%arr.length];
        }
    }

