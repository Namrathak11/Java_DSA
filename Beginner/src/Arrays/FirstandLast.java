package Arrays;

public class FirstandLast {
    public static void main(String[] main){
        int[] ans={-1,-1};
        int[] arr={2,4,4,4,4,4,5,6};
        int target=4;

        int start=search(arr,target,true);
        int end=search(arr,target,false);

        System.out.println(start);
        System.out.println(end);



    }
    static int search(int[] nums,int target, boolean findFirstIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;


        while(start<=end) {
            int mid=start+(end-start)/2;
                if (nums[mid] > target) {
                    end = mid - 1;
                } else if(nums[mid]<target) {
                    start = mid + 1;
                }else{
                    ans=mid;
                    if(findFirstIndex){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
            }
        }
        return ans;
    }
}
