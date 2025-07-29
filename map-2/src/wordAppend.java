import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            int count = countMap.getOrDefault(s, 0) + 1;
            countMap.put(s, count);
            if (count % 2 == 0) {
                result.append(s);
            }
        }
        return result.toString();
    }
}
