package com.hackerhank.joao.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> array = new HashMap<>();
        Map<Integer, Integer> frequencies = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for (List<Integer> query : queries) {
            Integer operation = query.get(0);
            Integer value = query.get(1);
            Integer previousFrequency;
            System.out.println();

            List<Integer> a = new ArrayList<>();

            List<Integer> prices = new ArrayList<>();
            Integer k = 0;


            List<Integer> pricesSorted = prices.stream().sorted().collect(Collectors.toList());


            Integer spent = 0;
            Integer toys = 0;
            while (spent < k) {
                Integer cost = pricesSorted.get(toys);
                spent += cost;
                toys++;
            }


            switch (operation) {
                case 1:
                    previousFrequency = array.getOrDefault(value, 0);

                    array.put(value, previousFrequency + 1);

                    frequencies.put(previousFrequency, frequencies.getOrDefault(previousFrequency, 1) - 1);
                    frequencies.put(previousFrequency + 1, frequencies.getOrDefault(previousFrequency + 1, 0) + 1);
                    break;
                case 2:
                    previousFrequency = array.getOrDefault(value, 0);
                    if (previousFrequency > 0) {
                        array.put(value, previousFrequency - 1);
                    }

                    frequencies.put(previousFrequency, frequencies.getOrDefault(previousFrequency, 1) - 1);
                    frequencies.put(previousFrequency - 1, frequencies.getOrDefault(previousFrequency - 1, 0) + 1);

                    break;
                case 3:
                    boolean exists = frequencies.containsKey(value) && frequencies.get(value) != 0;
                    if (exists) {
                        result.add(1);
                    } else {
                        result.add(0);
                    }
                    break;
            }
        }

        return result;
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        if (d == 0) {
            return 0;
        }

        int notifications = 0;
        for (int i = d; i < expenditure.size(); i++) {
            List<Integer> lastDays = expenditure.subList(i - d, i).stream().sorted().collect(Collectors.toList());
            float median = 0;
            if (d % 2 == 0) {
                median = (lastDays.get(d / 2) + lastDays.get(d / 2 + 1)) / 2;
            } else {
                median = lastDays.get(d / 2);
            }

            if (expenditure.get(i) > median) {
                notifications++;

            }
        }
        return notifications;
    }

}
