package com.hackerhank.joao.arrays;


import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        Long[] array = new Long[n + 1];
        Arrays.fill(array, 0L);

        for (List<Integer> query : queries) {
            Integer k = query.get(2);
            array[query.get(0) -1] += k;
            array[query.get(1)] -= k;
        }

        long max = Long.MIN_VALUE;
        long sum = 0;

        for (Long aLong : array) {
            sum += aLong;
            max = Math.max(max, sum);
        }

        return max;
    }
}
