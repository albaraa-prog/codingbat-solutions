import java.util.ArrayList;
import java.util.List;

public class noZ {
    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < strings.size(); i++){
            if(!strings.get(i).contains("z")){
                result.add(strings.get(i));
            }
        }
        return result;
    }
}
