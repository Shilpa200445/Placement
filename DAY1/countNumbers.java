public class countNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 7, 5, 5, 3};
        boolean[] counted = new boolean[arr.length]; // To track counted elements

        for (int i = 0; i < arr.length; i++) {
            if (counted[i]) continue; // Skip already counted numbers

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true; // Mark as counted
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
