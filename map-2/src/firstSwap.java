import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class firstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> swapped = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            char first = strings[i].charAt(0);
            if (swapped.contains(first)) continue;

            if (map.containsKey(first)) {
                int prevIndex = map.get(first);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                map.remove(first);
                swapped.add(first);
            } else {
                map.put(first, i);
            }
        }

        return strings;
    }
}
