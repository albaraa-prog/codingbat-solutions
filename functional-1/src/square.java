import java.util.ArrayList;
import java.util.List;

public class square {
    public List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            result.add(nums.get(i) * nums.get(i));
        }
        return result;
    }
}
