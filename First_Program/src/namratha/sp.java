package namratha;

public class sp {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("Before swapping:");
            System.out.println("a = " + a + ", b = " + b);

            // Call the swap function and pass 'a' and 'b'
            swapNumbers(a, b);

            System.out.println("After swapping:");
            System.out.println("a = " + a + ", b = " + b);
        }

        // Function to swap two numbers
        public static void swapNumbers(int x, int y) {
            int temp = x;
            x = y;
            y = temp;

//            System.out.println("Inside the function - Swapped values:");
            System.out.println("x = " + x + ", y = " + y);
        }
    }


