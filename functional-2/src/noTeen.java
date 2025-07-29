import java.util.ArrayList;
import java.util.List;

public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 13 || nums.get(i) > 19) {
                result.add(nums.get(i));
            }
        }
        return result;
    }

}
