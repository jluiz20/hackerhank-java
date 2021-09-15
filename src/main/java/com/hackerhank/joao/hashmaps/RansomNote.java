package com.hackerhank.joao.hashmaps;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        List<String> mutableMagazine = new ArrayList<>(magazine);

        for (String word : note) {
            boolean contains = mutableMagazine.remove(word);

            if (!contains) {
                System.out.println("No");

                return;
            }
        }

        System.out.println("Yes");
    }
}
