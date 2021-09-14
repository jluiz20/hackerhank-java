package com.hackerhank.joao.arrays;

public class MinimumSwaps2 {


    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;
                }
            }

            if (minPosition != i) {
                int temp = arr[i];
                arr[i] = arr[minPosition];
                arr[minPosition] = temp;

                swaps++;
            }
        }

        return swaps;
    }
}
