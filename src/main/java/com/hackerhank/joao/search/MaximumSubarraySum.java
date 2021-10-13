package com.hackerhank.joao.search;

import java.util.List;
import java.util.TreeSet;

public class MaximumSubarraySum {

    public static long maximumSum(List<Long> a, long m) {
        long maxSum = 0;

        TreeSet<Long> prefix = new TreeSet<>();
        long currSum = 0;

        for (Long aLong : a) {
            currSum = (currSum + aLong % m) % m;
            maxSum = Math.max(maxSum, currSum);

            Long pr = prefix.higher(currSum);
            if (pr != null) {
                maxSum = Math.max(maxSum, (currSum - pr + m) % m);
            }
            prefix.add(currSum);
        }

        return maxSum;
    }
}
