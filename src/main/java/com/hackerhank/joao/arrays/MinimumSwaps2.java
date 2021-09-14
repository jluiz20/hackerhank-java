package com.hackerhank.joao.arrays;

public class MinimumSwaps2 {


    static int minimumSwaps(int[] arr) {
        int i = 0;
        int swaps = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;

                swaps++;
            } else {
                i++;
            }
        }
        return swaps;
    }
}
