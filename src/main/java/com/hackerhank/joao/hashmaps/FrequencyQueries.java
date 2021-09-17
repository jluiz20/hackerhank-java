package com.hackerhank.joao.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

            switch (operation) {
                case 1:
                    previousFrequency = array.getOrDefault(value, 0);

                    array.put(value, previousFrequency + 1);

                    frequencies.put(previousFrequency, frequencies.getOrDefault(previousFrequency, 1) - 1);
                    frequencies.put(previousFrequency + 1, frequencies.getOrDefault(previousFrequency+1, 0) + 1);
                    break;
                case 2:
                    previousFrequency = array.getOrDefault(value, 0);
                    if (previousFrequency > 0) {
                        array.put(value, previousFrequency - 1);
                    }

                    frequencies.put(previousFrequency, frequencies.getOrDefault(previousFrequency, 1) - 1);
                    frequencies.put(previousFrequency - 1, frequencies.getOrDefault(previousFrequency-1, 0) + 1);

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

}
