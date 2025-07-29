import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char first = strings[i].charAt(0);
            if (map.containsKey(first)) {
                int prevIndex = map.get(first);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                map.remove(first);
            } else {
                map.put(first, i);
            }
        }
        return strings;
    }
}
