public class frontAgain {
    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        String first2 = str.substring(0, 2);
        String last2 = str.substring(str.length() - 2);
        return first2.equals(last2);
    }
}
