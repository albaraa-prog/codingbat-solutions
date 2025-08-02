public class scoresAverage {
    int scoresAverage(int[] scores) {
        int mid = scores.length / 2;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < mid; i++) sum1 += scores[i];
        for (int i = mid; i < scores.length; i++) sum2 += scores[i];
        int avg1 = sum1 / mid;
        int avg2 = sum2 / (scores.length - mid);
        return avg1 > avg2 ? avg1 : avg2;
    }
}
