package com.hackerhank.joao.sort;

public class MergeSortCountInversions {

    public static long countInversions(Integer[] array) {
        long inversions = 0;

        int length = array.length;

        if (length > 1) {
            int midpoint = array.length / 2;

            Integer[] left = new Integer[midpoint];
            Integer[] right = new Integer[length - midpoint];
            for (int i = 0; i < midpoint; i++) {
                left[i] = array[i];
            }

            for (int i = midpoint; i < length; i++) {
                right[i - midpoint] = array[i];
            }

            inversions += countInversions(left);
            inversions += countInversions(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                    inversions += midpoint + 1 - left.length - i;
                }
                k++;
            }

            while (i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }

            while (j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }

        }


        return inversions;
    }

}
