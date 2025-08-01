public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        sum = sum - min - max;
        return sum / (nums.length - 2);
    }
}
