public class fix34 {
    public int[] fix34(int[] nums) {
        int[] result = nums.clone();

        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] == 3) {
                if (result[i + 1] != 4) {
                    for (int j = 0; j < result.length; j++) {
                        if (result[j] == 4) {
                            boolean isProperlyPlaced = (j > 0 && result[j - 1] == 3);

                            if (!isProperlyPlaced) {
                                int temp = result[i + 1];
                                result[i + 1] = result[j];
                                result[j] = temp;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
