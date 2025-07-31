public class withoutString {
    public String withoutString(String base, String remove) {
        String result = "";
        int i = 0;
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        while (i < base.length()) {
            if (i <= base.length() - remove.length() && baseLower.substring(i, i + remove.length()).equals(removeLower)) {
                i += remove.length();
            } else {
                result += base.charAt(i);
                i++;
            }
        }
        return result;
    }
}
