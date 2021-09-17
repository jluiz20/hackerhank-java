package com.hackerhank.joao.hashmaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> left = new HashMap<>();
        Map<Long, Long> right = new HashMap<>();

        for (long i :arr) {
            right.put(i, right.getOrDefault(i, 0L) + 1);
        }

        long triplets = 0;

        for (int i = 0; i < arr.size(); i++) {
            long midValue = arr.get(i);
            long c1 = 0;
            long c3 = 0;

            right.put(midValue, right.getOrDefault(midValue, 0L) - 1);

            if (left.containsKey(midValue / r) && midValue % r == 0) {
                c1 = left.get(midValue / r);
            }

            if (right.containsKey(midValue * r)) {
                c3 = right.get(midValue * r);
            }

            triplets += c1 * c3;

            left.put(midValue, left.getOrDefault(midValue, 0L) + 1);

        }

        return triplets;

    }

}
