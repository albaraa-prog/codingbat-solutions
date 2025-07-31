public class squareUp {
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = n * i - 1; j >= n * (i - 1); j--) {
                if (count <= i) {
                    result[j] = count;
                    count++;
                } else {
                    result[j] = 0;
                }
            }
        }
        return result;
    }
}
