public class without2 {
    public String without2(String str) {
        if (str.length() < 2) return str;
        String first2 = str.substring(0, 2);
        String last2 = str.substring(str.length() - 2);
        if (first2.equals(last2)) {
            return str.length() == 2 ? "" : str.substring(2);
        }
        return str;
    }
}
