public class strDist {
    public int strDist(String str, String sub) {
        if(str.length() < sub.length()) return 0;
        if(str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub)) return str.length();
        if(!str.substring(0, sub.length()).equals(sub)) return strDist(str.substring(1), sub);
        return strDist(str.substring(0, str.length()-1), sub);
    }
}
