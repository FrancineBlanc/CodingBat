package map1;

import java.util.Map;

public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            String val = map.get("ice cream");
            map.put("yogurt", val);
        }
        if (map.containsKey("spinach")) {
            map.replace("spinach", "nuts");
        }
        return map;
    }
}
