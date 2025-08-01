public class twoTwo {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean leftIsTwo = (i > 0 && nums[i - 1] == 2);
                boolean rightIsTwo = (i < nums.length - 1 && nums[i + 1] == 2);
                if (!leftIsTwo && !rightIsTwo) {
                    return false;
                }
            }
        }
        return true;
    }
}
