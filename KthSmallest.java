
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

    // Function to find the K'th smallest element using sorting
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array
        return arr[k - 1]; // Return the K'th smallest element (0-based index)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input the elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Find and print the K'th smallest element
        if (k > 0 && k <= n) {
            int result = findKthSmallest(arr, k);
            System.out.println("The " + k + "th smallest element is: " + result);
        } else {
            System.out.println("Invalid value of k. It should be between 1 and " + n);
        }

        scanner.close();
    }
}
