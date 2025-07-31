public class sameEnds {
    public String sameEnds(String str) {
        int maxLen = str.length() / 2;
        String result = "";
        for (int i = 0; i <= maxLen; i++) {
            String prefix = str.substring(0, i);
            String suffix = str.substring(str.length() - i);
            if (prefix.equals(suffix)) {
                result = prefix;
            }
        }
        return result;
    }
}
