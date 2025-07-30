public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int maxBig = goal / 5;
        int useBig = Math.min(big, maxBig);
        int remaining = goal - useBig * 5;
        return small >= remaining;
    }
}
