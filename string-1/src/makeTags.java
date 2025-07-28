public class makeTags {
    public String makeTags(String tag, String word) {
        String t1 = "<" + tag + ">";
        String t2 = "</" + tag + ">";
        return t1 + word + t2;
    }
}
