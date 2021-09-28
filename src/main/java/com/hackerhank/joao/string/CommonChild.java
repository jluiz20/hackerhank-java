package com.hackerhank.joao.string;

import java.util.List;

public class CommonChild {

    public static int commonChild(String s1, String s2) {
        int[] memo = new int[s2.length() + 1];

        for (int i = 1; i <= s1.length(); i++) {
            int prev = 0;

            for (int j = 1; j <= s2.length(); j++) {
                int temp = memo[j];

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    memo[j] = prev + 1;
                } else {
                    memo[j] = Math.max(memo[j], memo[j - 1]);
                }

                prev = temp;
            }
        }

        List<Integer> arr;



        return memo[s2.length()];
    }
}
