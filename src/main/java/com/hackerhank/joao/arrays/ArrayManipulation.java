package com.hackerhank.joao.arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        Long[] array = new Long[n];
        Arrays.fill(array, 0L);

        for (List<Integer> query : queries) {
            int j = query.get(0) - 1;
            while (j <= query.get(1) - 1) {
                array[j] = array[j] + query.get(2);
                j++;
            }
        }

        return Collections.max(Arrays.asList(array));
    }
}
