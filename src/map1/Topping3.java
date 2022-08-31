package map1;

import java.util.Map;

public class Topping3 {
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            String potatoVal = map.get("potato");
            map.put("fries", potatoVal);
        }

        if (map.containsKey("salad")) {
            String saladVal = map.get("salad");
            map.put("spinach", saladVal);
        }
        return map;
    }
}
