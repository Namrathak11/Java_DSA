package Practice;
import java.util.Scanner;

public class chot {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = in.nextInt();
        int ans = search(a, target);

        if (ans != -1) {
            System.out.println(target + " found at index: " + ans);
        } else {
            System.out.println(target + " not found.");
        }
    }

    static int search(int[] arr, int aim) {
        // Handle empty array case
        if (arr.length == 0) return -1;

        int start = 0;
        int end = 1;

        // Expand the range for the binary search
        while (end < arr.length && arr[end] < aim) {
            start = end;
            end = end * 2; // Double the end index to find the range
        }

        // Ensure end does not exceed array bounds
        end = Math.min(end, arr.length - 1);

        return bin(arr, aim, start, end);
    }

    static int bin(int[] ar, int aim, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ar[mid] == aim) {
                return mid; // Return index if found
            } else if (ar[mid] > aim) {
                end = mid - 1; // Search left half
            } else {
                start = mid + 1; // Search right half
            }
        }
        return -1; // Return -1 if not found
    }
}
