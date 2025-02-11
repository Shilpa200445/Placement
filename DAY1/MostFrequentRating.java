public class MostFrequentRating {
    public static void main(String[] args) {
        int[] ratings = { 4, 5, 3, 5, 2, 5, 4, 3, 5, 2, 4, 4 };
        int maxCount = 0;
        int mostFrequent = ratings[0];

        for (int i = 0; i < ratings.length; i++) {
            int count = 0;

            for (int j = 0; j < ratings.length; j++) {
                if (ratings[j] == ratings[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ratings[i];
            }
        }
        System.out.println("The most frequent rating is: " + mostFrequent);
    }
}