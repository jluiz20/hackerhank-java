package com.hackerhank.joao.string;

public class SpecialStringAgain {

    static long substrCount(int n, String s) {
        int specialStrings = n;
        int consecutiveChars = 1;
        int middleIndex = -1;

        for (int i = 1; i < n; i++) {
            char currentChar = s.charAt(i);
            char previousChar = s.charAt(i - 1);

            if (currentChar == previousChar) {
                specialStrings += consecutiveChars;
                consecutiveChars++;

                if (middleIndex > 0) {
                    if ((middleIndex - consecutiveChars) > 0
                            && s.charAt(middleIndex - consecutiveChars) == currentChar) {
                        specialStrings++;
                    } else {
                        middleIndex = -1;
                    }
                }
            } else {
                consecutiveChars = 1;

                if (((i - 2) >= 0) && s.charAt(i - 2) == currentChar) {
                    specialStrings++;

                    middleIndex = i - 1;
                } else {
                    middleIndex = -1;
                }
            }
        }

        return specialStrings;
    }
}
