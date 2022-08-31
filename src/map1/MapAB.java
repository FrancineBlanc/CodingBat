package map1;

import java.util.Map;

public class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        String mapString = "";
        if (map.containsKey("a") && map.containsKey("b")) {
            mapString += map.get("a") + map.get("b");
            map.put("ab", mapString);
        }
        return map;
    }
}
