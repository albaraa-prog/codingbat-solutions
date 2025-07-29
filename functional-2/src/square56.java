import java.util.ArrayList;
import java.util.List;

public class square56 {
    public List<Integer> square56(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int val = num * num + 10;
            int lastDigit = val % 10;
            if (lastDigit != 5 && lastDigit != 6) {
                result.add(val);
            }
        }
        return result;
    }
}
