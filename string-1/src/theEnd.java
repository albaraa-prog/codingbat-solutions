public class theEnd {
    public String theEnd(String str, boolean front) {
        if(front){
            return String.valueOf(str.charAt(0));
        }
        return str.substring(str.length() - 1);
    }
}
