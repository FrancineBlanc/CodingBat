package map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String > map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s.substring(0, 1))) {
                map.put(s.substring(0, 1), s);
            } else {
                String word = map.get(s.substring(0, 1)) + s;
                map.put(s.substring(0, 1), word);
            }
        }
        return map;
    }
}
