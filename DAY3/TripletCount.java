import java.util.Arrays;

public class TripletCount {
    public static int countTriplets(int[] arr, int targetSum) {
        int count = 0;
        int n = arr.length;

        // Sort the array to use the two-pointer technique
        Arrays.sort(arr);

        // Iterate through the array
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == targetSum) {
                    count++;
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,1,4,1};
        int targetSum = 6;
        int result = countTriplets(arr, targetSum);
        System.out.println("Count of triplets: " + result);
    }
}
