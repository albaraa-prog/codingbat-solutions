public class gHappy {
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if ( (i > 0 && str.charAt(i - 1) == 'g') || (i < str.length() - 1 && str.charAt(i + 1) == 'g') ) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
