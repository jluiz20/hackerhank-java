package com.hackerhank.joao.string;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SherlockAndValidString {

    public static String isValid(String s) {
        int[] occurrences = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i) - 97;
            occurrences[ascii] = occurrences[ascii] + 1;
        }

        Map<Integer, Integer> quantities = new TreeMap<>();

        for (int occurrence : occurrences) {
            if (occurrence > 0) {
                quantities.put(occurrence, quantities.getOrDefault(occurrence, 0) + 1);
            }
        }

        if (quantities.keySet().size() > 2) return "NO";
        if (quantities.keySet().size() == 1) return "YES";

        Integer minKey = Collections.min(quantities.keySet());
        Integer maxKey = Collections.max(quantities.keySet());

        if (quantities.get(minKey) == 1) {
            if (minKey == 1) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            if (quantities.get(maxKey) == 1 && maxKey - 1 == minKey) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }
}
