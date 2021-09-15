package com.hackerhank.joao.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAnagrams {
    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> substrings = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char[] c = s.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                String sub = new String(c);

                if (substrings.containsKey(sub)) {
                    substrings.put(sub, substrings.get(sub) + 1);
                } else {
                    substrings.put(sub, 1);
                }
            }
        }

        Integer anagrams = 0;

        for (String sub : substrings.keySet()) {
            int value = substrings.get(sub);

            anagrams += (value * (value - 1)) / 2;
        }

        return anagrams;

    }
}
