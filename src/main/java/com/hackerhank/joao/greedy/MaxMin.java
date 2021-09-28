package com.hackerhank.joao.greedy;

import java.util.Collections;
import java.util.List;

public class MaxMin {

    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.size() - k; i++) {
            int temp = arr.get(i + k - 1) - arr.get(i);
            if (temp < min) {
                min = temp;
            }
        }

        return min;
    }
}
