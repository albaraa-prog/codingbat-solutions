import java.util.ArrayList;
import java.util.List;

public class noLong {
    public List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < 4) {
                result.add(strings.get(i));
            }
        }
        return result;
    }
}
