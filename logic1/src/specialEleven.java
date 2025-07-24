public class specialEleven {
    public boolean specialEleven(int n) {
        Boolean rem1 = n % 11 == 1;
        Boolean rem2 = n % 11 == 0;

        return rem1 || rem2;

}
