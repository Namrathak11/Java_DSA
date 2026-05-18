package Practice;

public class Sorted {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 2, 4, 5};
        int target = 3;
        int start = search(a, target, true);
        int end = search(a, target, false);

        System.out.println("First occurence is: " + start);
        System.out.println("End occurence is: " + end);


    }

    static int search(int[] arr, int aim, boolean isfirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > aim) {
                end = mid - 1;
            } else if (arr[mid] < aim) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;

    }
}
