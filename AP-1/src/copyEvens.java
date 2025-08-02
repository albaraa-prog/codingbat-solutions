public class copyEvens {
    int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int idx = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[idx++] = num;
                if (idx == count) break;
            }
        }
        return result;
    }
}
