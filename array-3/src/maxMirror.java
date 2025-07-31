public class maxMirror {
    public int maxMirror(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int length = 0;
                while (i + length < nums.length && j - length >= 0
                        && nums[i + length] == nums[j - length]) {
                    length++;
                }
                if (length > max) max = length;
            }
        }
        return max;
    }
}
