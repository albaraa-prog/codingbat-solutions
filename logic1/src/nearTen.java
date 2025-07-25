public class nearTen {
    public boolean nearTen(int num) {
        int near10 = num % 10;
        return near10 <= 2 || near10 >= 8;
    }
}
