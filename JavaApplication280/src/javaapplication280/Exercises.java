package javaapplication280;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

//  Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                String val = map.get(key) + strings[i];
                map.put(key, val);
            } else {
                map.put(key, strings[i]);
            }
        }
        return map;
    }

}
