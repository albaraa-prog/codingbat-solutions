import java.util.HashMap;
import java.util.Map;

public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            String value = String.valueOf(s.charAt(s.length()-1));
            map.put(key, value);
        }
        return map;
    }
}
