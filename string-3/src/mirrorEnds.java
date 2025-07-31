public class mirrorEnds {
    public String mirrorEnds(String str) {
        int len = str.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == str.charAt(len - 1 - i)) {
                result.append(str.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
