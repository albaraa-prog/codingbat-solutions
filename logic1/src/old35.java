public class old35 {
    public boolean old35(int n) {
        boolean rem1 = n % 3 ==0;
        boolean rem2 = n % 5 ==0;

        return (rem1 || rem2) && !(rem1 && rem2);
    }
}
