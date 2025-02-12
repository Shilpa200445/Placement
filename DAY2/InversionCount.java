
class InversionCount {
    public static void main(String[] args) {
        int arr[] = {30, 45, 25, 60, 20};
        int n = arr.length;
        int inversionCount = 0;
          for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {  
                    inversionCount++;
                }
            }
        }
      System.out.println("The inversion count is " + inversionCount);
    }
}