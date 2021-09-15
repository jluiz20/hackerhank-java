package com.hackerhank.joao.hashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        Set<String> set1 = s1.chars().mapToObj(Objects::toString).collect(Collectors.toSet());
        Set<String> set2 = s2.chars().mapToObj(Objects::toString).collect(Collectors.toSet());

        for (String s : set1) {
            if (set2.contains(s)) {
                return "YES";
            }
        }

        return "NO";
    }
}
