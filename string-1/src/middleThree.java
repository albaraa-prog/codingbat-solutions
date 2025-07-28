public class middleThree {
    public String middleThree(String str) {
        if(str.length() < 3) return str;
        int m = str.length() / 2;
        return str.substring(m - 1, m + 2);
    }
}
