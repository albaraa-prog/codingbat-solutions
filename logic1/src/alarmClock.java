public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        boolean weekend = (day == 0 || day == 6);

        if (vacation) {
            if (weekend) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (weekend) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }
}
