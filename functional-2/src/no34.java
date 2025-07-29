import java.util.ArrayList;
import java.util.List;

public class no34 {
    public List<String> no34(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).length() != 3 && strings.get(i).length() != 4){
                result.add(strings.get(i));
            }
        }
        return result;
    }
}
