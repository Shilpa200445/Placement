 public class HighestSales{
    public static void main(String[] args)
     {
        int[] sales = {120, 340, 560, 230, 890, 450, 670}; 
        int maxDay = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxDay]) {
                maxDay = i;
            }
        }
        System.out.println("Highest sales on Day " + (maxDay + 1) + ": " + sales[maxDay]);
    }
}  