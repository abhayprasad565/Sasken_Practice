import java.util.*;

public class findNumberOfX {
    // Function to find the first occurrence of X
    public static int binarySearchFirst(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return binarySearchFirst(arr, mid + 1, high, x);
            } else {
                return binarySearchFirst(arr, low, mid - 1, x);
            }
        }
        return -1;
    }

    // Function to find the last occurrence of X
    public static int binarySearchLast(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if ((mid == arr.length - 1 || x < arr[mid + 1]) && arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                return binarySearchLast(arr, low, mid - 1, x);
            } else {
                return binarySearchLast(arr, mid + 1, high, x);
            }
        }
        return -1;
    }

    // Function to count the number of occurrences of X
    public static int countOccurrences(int[] arr, int x) {
        int n = arr.length;
        int first = binarySearchFirst(arr, 0, n - 1, x);
        if (first == -1) {
            return 0;
        }
        int last = binarySearchLast(arr, 0, n - 1, x);
        return last - first + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The number of Occurences of " + x + " is " + countOccurrences(arr, x));
    }
}
