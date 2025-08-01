public class evenOdd {
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start++] = num;
            } else {
                result[end--] = num;
            }
        }
        return result;
    }
}
