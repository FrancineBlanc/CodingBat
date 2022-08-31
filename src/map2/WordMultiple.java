package map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }
}
