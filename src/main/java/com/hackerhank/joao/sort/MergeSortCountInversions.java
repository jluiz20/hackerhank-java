package com.hackerhank.joao.sort;

public class MergeSortCountInversions {

    static long countInversions(Integer[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(Integer[] arr, int leftIndex, int rightIndex) {
        long inversions = 0;

        if (leftIndex < rightIndex) {
            int midpoint = leftIndex + (rightIndex - leftIndex) / 2;

            inversions += mergeSort(arr, leftIndex, midpoint);
            inversions += mergeSort(arr, midpoint + 1, rightIndex);
            inversions += merge(arr, leftIndex, midpoint, rightIndex);
        }

        return inversions;
    }

    private static long merge(Integer[] arr, int l, int midpoint, int r) {
        int leftSize = midpoint - l + 1;
        int rightSize = r - midpoint;

        Integer[] left = new Integer[leftSize];
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[l + i];
        }

        Integer[] right = new Integer[rightSize];
        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[midpoint + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;
        long inversions = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
                inversions += left.length - i;
            }
        }

        while (i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return inversions;
    }

}
