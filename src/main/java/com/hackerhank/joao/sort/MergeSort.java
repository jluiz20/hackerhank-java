package com.hackerhank.joao.sort;

public class MergeSort {

    public static Integer[] mergeSort(Integer[] array) {
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


            mergeSort(left);
            mergeSort(right);

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


        return array;
    }

}
