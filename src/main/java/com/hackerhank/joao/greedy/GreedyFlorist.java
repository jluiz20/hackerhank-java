package com.hackerhank.joao.greedy;

import java.util.Arrays;

public class GreedyFlorist {

    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c );

        int totalCost = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            int unitCost = (((c.length - i - 1) / k) + 1) * c[i];
            totalCost += unitCost;
        }

        return totalCost;
    }
}
