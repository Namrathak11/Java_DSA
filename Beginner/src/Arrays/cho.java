package Arrays;

public class cho {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int ans = search(a, target, true); // Searching in ascending order
        System.out.println(ans); // Should print the index of target (3 in this case)

        // Example for descending order search
        int[] b = {10, 9, 8, 7, 6, 5, 2, 1};
        ans = search(b, target, false); // Searching in descending order
        System.out.println(ans); // Should print -1 as 6 is not present
    }

    static int search(int[] arr, int aim, boolean isAsc) {
        int start = 0;
        int end = arr.length - 1;

        if (isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == aim) {
                    return mid;
                } else if (arr[mid] > aim) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } else {
            while (start <= end) { // Fixed condition here
                int mid = start + (end - start) / 2;
                if (arr[mid] == aim) {
                    return mid;
                } else if (arr[mid] < aim) {
                    end = mid - 1; // Change comparison for descending order
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Return -1 if not found
    }
}
