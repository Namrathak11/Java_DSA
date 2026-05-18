package Arrays;

public class Gpt {
    public static void main(String[] args) {
        // Initialize the array with some values and target
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Find the first and last occurrence of the target
        int start = search(arr, target, true);
        int end = search(arr, target, false);

        // Print results
        System.out.println("First occurrence: " + start);
        System.out.println("Last occurrence: " + end);
    }

    static int search(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid; // Found the target
                if (findFirstIndex) {
                    end = mid - 1; // Continue searching to the left
                } else {
                    start = mid + 1; // Continue searching to the right
                }
            }
        }
        return ans;
    }
}
