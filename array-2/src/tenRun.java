public class tenRun {
    public int[] tenRun(int[] nums) {
        Integer currentMultiple = null;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                currentMultiple = nums[i];
            } else if (currentMultiple != null) {
                nums[i] = currentMultiple;
            }
        }
        return nums;
    }
}
