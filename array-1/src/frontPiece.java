public class frontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[] { nums[0], nums[1] };
        } else {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i];
            }
            return result;
        }
    }
}
