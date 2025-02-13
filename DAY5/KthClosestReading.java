import java.util.Random;

public class KthClosestReading {
    
    // Function to find the k-th closest reading to the target temperature
    public static int findKthClosest(int[] readings, int target, int k) {
        return quickSelect(readings, target, 0, readings.length - 1, k - 1);
    }
    
    // QuickSelect function to find the k-th closest element
    private static int quickSelect(int[] readings, int target, int left, int right, int k) {
        if (left >= right) return readings[left]; // Base case: if only one element remains
        
        int pivotIndex = partition(readings, target, left, right); // Partitioning step
        
        // If pivot index matches k, return the value at that index
        if (k == pivotIndex) return readings[k];
        // Recur on left or right side depending on k
        if (k < pivotIndex) return quickSelect(readings, target, left, pivotIndex - 1, k);
        return quickSelect(readings, target, pivotIndex + 1, right, k);
    }
    
    // Partition function for QuickSelect
    private static int partition(int[] readings, int target, int left, int right) {
        int pivotIndex = new Random().nextInt(right - left + 1) + left; // Select a random pivot
        int pivotValue = Math.abs(readings[pivotIndex] - target); // Pivot distance from target
        swap(readings, pivotIndex, right); // Move pivot to the end
        int storeIndex = left;
        
        // Rearrange elements based on their distance from the target
        for (int i = left; i < right; i++) {
            if (Math.abs(readings[i] - target) < pivotValue) {
                swap(readings, i, storeIndex++);
            }
        }
        swap(readings, storeIndex, right); // Move pivot to its correct position
        return storeIndex;
    }
    
    // Helper function to swap two elements in the array
    private static void swap(int[] readings, int i, int j) {
        int temp = readings[i];
        readings[i] = readings[j];
        readings[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74}; // Sensor temperature readings
        int target = 73; // Target temperature
        int k = 2; // Find the 2nd closest reading
        
        System.out.println(findKthClosest(readings, target, k)); // Output: 74
    }
}