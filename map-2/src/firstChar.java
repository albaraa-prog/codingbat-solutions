import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String key = String.valueOf(s.charAt(0));
            map.put(key, map.getOrDefault(key, "") + s);
        }
        return map;
    }
}
