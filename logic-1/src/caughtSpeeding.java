public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int extra = isBirthday ? 5 : 0;
        if (speed <= 60 + extra) {
            return 0;
        } else if (speed <= 80 + extra) {
            return 1;
        } else {
            return 2;
        }
    }
}
