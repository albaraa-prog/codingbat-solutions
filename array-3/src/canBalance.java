public class canBalance {
    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int left = 0, right = 0;
            for (int j = 0; j <= i; j++) left += nums[j];
            for (int j = i + 1; j < nums.length; j++) right += nums[j];
            if (left == right) return true;
        }
        return false;
    }
}
