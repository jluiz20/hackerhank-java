package com.hackerhank.joao.arrays;

import java.util.Arrays;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int size = a.size();

        Integer[] arr = a.toArray(new Integer[0]);

        for (int i = 0; i < size; i++) {
            int newIndex = (i + (size - d)) % size;

            arr[newIndex] = a.get(i);

        }

        return Arrays.asList(arr);
    }
}
