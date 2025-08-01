public class sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;

        for (int n : nums) {
            if (n == 6) {
                skip = true;
            }
            if (!skip) {
                sum += n;
            }
            if (skip && n == 7) {
                skip = false;
            }
        }
        return sum;
    }
}
