package com.hackerhank.joao.search;

import java.util.Arrays;

public class MinimumTimeRequired {

    static long minTime(long[] machines, long goal) {
        Arrays.sort(machines);

        long minDays = goal / machines.length * machines[0];
        long maxDays = (long) Math.ceil((double) goal / machines.length) * machines[machines.length - 1];
        long result = -1;

        while (minDays < maxDays) {
            long mid = (minDays + maxDays) / 2;
            long units = 0;

            for (long machine : machines) {
                units += mid / machine;
            }

            if (units < goal) {
                minDays = mid + 1;
            } else {
                result = mid;
                maxDays = mid;
            }
        }

        return result;
    }
}
