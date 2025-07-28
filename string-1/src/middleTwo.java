public class middleTwo {
    public String middleTwo(String str) {
        if(str.length() < 2) return str;
        int m = str.length() / 2;
        return str.substring(m - 1, m + 1);
    }
}
