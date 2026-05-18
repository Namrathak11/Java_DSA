public class SwapNumbers {

        public static void main(String[] args) {
            int[] numbers = {5, 10};

            System.out.println("Before swapping:");
            System.out.println( numbers[0] + "  " + numbers[1]);

            // Call the swap function and pass the array
            swapNumbers(numbers);

            System.out.println("After swapping:");
            System.out.println(numbers[0] + "  "+ numbers[1]);
        }

        // Function to swap two numbers using an array
        public static void swapNumbers(int[] arr) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;

            System.out.println("Inside the function - Swapped values:");
            System.out.println(arr[0] + "  " + arr[1]);
        }
    }


