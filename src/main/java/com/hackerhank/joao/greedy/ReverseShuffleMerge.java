package com.hackerhank.joao.greedy;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ReverseShuffleMerge {

    public static String reverseShuffleMerge(String s) {
        Map<Character, Integer> unused = new TreeMap<>();
        Map<Character, Integer> used = new TreeMap<>();
        Map<Character, Integer> required = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            unused.put(key, unused.getOrDefault(key, 0) + 1);
        }

        for (Character key : unused.keySet()) {
            required.put(key, unused.get(key) / 2);
        }

        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char key = s.charAt(i);
            unused.put(key, unused.get(key) - 1);

            if (Objects.equals(used.get(key), required.get(key))) {
                continue;
            }

            while (result.length() > 0) {
                char prev = result.charAt(result.length() - 1);
                if ((key < prev) && (used.get(prev) + unused.get(prev) - 1 >= required.get(prev))) {

                    result.deleteCharAt(result.length() - 1);
                    used.put(prev, used.get(prev) - 1);
                } else {
                    break;
                }
            }

            result.append(key);
            used.put(key, used.getOrDefault(key, 0) + 1);
        }

        return result.toString();
    }
}
