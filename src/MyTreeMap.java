import java.util.*;

public class MyTreeMap {
    Map<String, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

    void add(String str) {
        String key = str.split(" ")[0];
        boolean flag = Character.isLetter(str.charAt(0));
        if (map.containsKey(key)) {
            List<String> val = map.get(key);
            if (flag) {
                val.add(str);
            } else {
                val.add(str.split(" ")[1]);
            }
        } else {
            List<String> val = new ArrayList<>();
            if (flag) {
                val.add(str);
            } else {
                val.add(str.split(" ")[1]);
            }
            map.put(key, val);
        }
    }

    void print() {
        System.out.println(map);
    }

}
