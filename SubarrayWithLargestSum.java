import java.util.*;

class SubarrayWithLargestSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Lasgest Subarray sum is " + largestSubarraySum(arr));
    }

    public static int largestSubarraySum(int[] arr) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0)
                sum = 0;
            else
                maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}