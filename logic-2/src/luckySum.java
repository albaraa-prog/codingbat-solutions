public class luckySum {
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13) return sum;
        if(b == 13) return sum = a;
        if(c == 13) return sum = a + b;
        if(a != 13 && b != 13 && c != 13) return sum = a + b + c;
        return sum;
    }
}
