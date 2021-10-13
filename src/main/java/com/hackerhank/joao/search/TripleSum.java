package com.hackerhank.joao.search;

import java.util.Arrays;

public class TripleSum {

    static long triplets(int[] a, int[] b, int[] c) {
        a = Arrays.stream(a).distinct().sorted().toArray();
        b = Arrays.stream(b).distinct().sorted().toArray();
        c = Arrays.stream(c).distinct().sorted().toArray();

        int i = 0;
        int j = 0;
        int k = 0;
        long counter = 0;

        while (j < b.length) {
            while (i < a.length && a[i] <= b[j]) {
                i++;
            }

            while (k < c.length && c[k] <= b[j]) {
                k++;
            }

            counter += (long) i * k;
            j++;
        }

        return counter;
    }
}
