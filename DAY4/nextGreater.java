public class nextGreater {
        public static void main(String[] args) {
            int[] arr = {1, 3, 2, 4};
            printArray(findNextGreater(arr, 0, new int[arr.length]));
            
        }
        // Recursive function to find the next greater element
        public static int[] findNextGreater(int[] arr, int index, int[] result) {
            if (index == arr.length) return result; // Base case
            
            result[index] = -1; // Default value if no greater element is found
            for (int j = index + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    result[index] = arr[j];
                    break;
                }
            }
    
            return findNextGreater(arr, index + 1, result); // Recursive call for next index
        }
    
        // Utility function to print the array
        public static void printArray(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
    

