import java.util.ArrayList;
import java.util.List;

public class addStar {
    public List<String> addStar(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            result.add(strings.get(i) + "*");
        }
        return result;
    }
}
