package map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[] {"a", "", "a"}));
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
            if (map.get(s) % 2 == 0) {
                stringBuilder.append(s);
            }
        }
        return stringBuilder.toString();
    }
}
