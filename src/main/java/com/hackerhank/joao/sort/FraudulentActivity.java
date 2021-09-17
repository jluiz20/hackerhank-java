package com.hackerhank.joao.sort;

import java.util.List;

public class FraudulentActivity {

    public static int activityNotifications(List<Integer> expenditure, int d) {

        Integer[] expenditureArray = expenditure.toArray(new Integer[0]);
        int noti = 0;
        int[] cntArr = new int[201];

        for (int i = 0; i < d; i++) {
            cntArr[expenditureArray[i]]++;
        }

        for (int i = d; i < expenditureArray.length; i++) {
            double median = findMedian(cntArr, d);

            if (2 * median <= expenditureArray[i]) {
                noti++;
            }

            cntArr[expenditureArray[i - d]]--;
            cntArr[expenditureArray[i]]++;
        }

        return noti;
    }

    static double findMedian(int[] cntArr, int d) {
        int cnt = 0;
        double rslt = 0;

        if (d % 2 != 0) {
            for (int i = 0; i < cntArr.length; i++) {
                cnt += cntArr[i];

                if (cnt > d / 2) {
                    rslt = i;
                    break;
                }
            }
        } else {
            int first = 0;
            int second = 0;

            for (int i = 0; i < cntArr.length; i++) {
                cnt += cntArr[i];
                if (first == 0 && cnt >= d / 2) {
                    first = i;
                }
                if (second == 0 && cnt >= d / 2 + 1) {
                    second = i;
                    break;
                }
            }
            rslt = (first + second) / 2.0;
        }
        return rslt;
    }
}
