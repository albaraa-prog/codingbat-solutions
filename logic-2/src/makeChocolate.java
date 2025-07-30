public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        int useBig = Math.min(big, maxBig);
        int remaining = goal - useBig * 5;
        return (remaining <= small) ? remaining : -1;
    }
}
