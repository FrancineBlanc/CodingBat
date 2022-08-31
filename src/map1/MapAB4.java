package map1;

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int lenA = map.get("a").length();
            int lenB = map.get("b").length();

            if (lenA != lenB) {
                if (lenA > lenB) {
                    map.put("c", map.get("a"));
                } else {
                    map.put("c", map.get("b"));
                }
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
