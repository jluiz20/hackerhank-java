package com.hackerhank.joao.sort;

import java.util.List;
import java.util.stream.Collectors;

public class FraudulentActivity {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        if (d == 0) {
            return 0;
        }

        int notifications = 0;
        for (int i = d; i < expenditure.size(); i++) {
            List<Integer> lastDays = expenditure.subList(i - d, i ).stream()
                    .sorted()
                    .collect(Collectors.toList());
            float median;

            if (d % 2 == 0) {
                median = (float) (lastDays.get(d / 2 - 1) + lastDays.get(d / 2)) / 2;
            } else {
                median = lastDays.get((d + 1) / 2 - 1);
            }

            if (expenditure.get(i) >= (median * 2)) {
                notifications++;

            }
        }

        return notifications;
    }
}
