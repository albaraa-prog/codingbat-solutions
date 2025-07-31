public class countClumps {
    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            int val = nums[i];
            int length = 0;
            while (i < nums.length && nums[i] == val) {
                length++;
                i++;
            }
            if (length > 1) count++;
        }
        return count;
    }
}
