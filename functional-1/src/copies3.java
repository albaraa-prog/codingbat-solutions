import java.util.ArrayList;
import java.util.List;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                sb.append(s);
            }
            result.add(sb.toString());
        }
        return result;
    }
}
