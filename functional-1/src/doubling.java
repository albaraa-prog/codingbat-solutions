import java.util.ArrayList;
import java.util.List;

public class doubling {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            result.add(nums.get(i) * 2);
        }
        return result;
    }
}
