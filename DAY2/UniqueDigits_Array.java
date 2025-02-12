public class UniqueDigits_Array 
{
    public static void main(String[] args) {
        int N[] = {111, 222, 333, 4444, 666}; // Input array
        int uniqueDigits[] = new int[10]; // Array to track digits (0-9)

        // Extract digits from each number
        for (int i = 0; i < N.length; i++) {
            int num = N[i];
            while (num > 0) {
                int digit = num % 10; // Extract last digit
                uniqueDigits[digit] = 1; // Mark digit as present
                num /= 10; // Remove last digit
            }
        }

        // Print sorted unique digits manually
        System.out.print("[");
        boolean first = true;
        for (int i = 0; i < 10; i++) {
            if (uniqueDigits[i] == 1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println("]");
    }
}