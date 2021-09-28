package com.hackerhank.joao.greedy;

import java.util.List;

public class LuckBalance {


    public static int luckBalance(int k, List<List<Integer>> contests) {
        contests.sort((o1, o2) -> o2.get(0).compareTo(o1.get(0)));

        int luck = 0;
        int lost = 0;

        for (List<Integer> integers : contests) {
            int contest = integers.get(0);
            int importance = integers.get(1);

            if (importance == 0) {
                luck += contest;
            } else {
                if (lost < k) {
                    luck += contest;
                    lost++;
                } else {
                    luck -= contest;
                }
            }
        }

        return luck;
    }
}
