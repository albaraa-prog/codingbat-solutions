public class zeroFront {
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index--;
            }
        }
        return result;
    }
}
