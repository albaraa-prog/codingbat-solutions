import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        for (String key : countMap.keySet()) {
            result.put(key, countMap.get(key) >= 2);
        }
        return result;
    }
}
