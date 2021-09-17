package com.hackerhank.joao.sort;

import java.util.List;

public class FraudulentActivity {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notifications = 0;
        int[] countingArray = new int[201];

        for (int i = 0; i < d; i++) {
            countingArray[expenditure.get(i)]++;
        }

        for (int i = d; i < expenditure.size(); i++) {
            double median = findMedian(countingArray, d);

            if (2 * median <= expenditure.get(i)) {
                notifications++;
            }

            countingArray[expenditure.get(i - d)]--;
            countingArray[expenditure.get(i)]++;
        }

        return notifications;
    }

    static double findMedian(int[] countingArray, int d) {
        int counting = 0;
        double result = 0;

        if (d % 2 != 0) {
            for (int i = 0; i < countingArray.length; i++) {
                counting += countingArray[i];

                if (counting > d / 2) {
                    result = i;
                    break;
                }
            }
        } else {
            int first = 0;
            int second = 0;

            for (int i = 0; i < countingArray.length; i++) {
                counting += countingArray[i];
                if (first == 0 && counting >= d / 2) {
                    first = i;
                }
                if (counting >= d / 2 + 1) {
                    second = i;
                    break;
                }
            }

            result = (first + second) / 2.0;
        }
        return result;
    }
}
