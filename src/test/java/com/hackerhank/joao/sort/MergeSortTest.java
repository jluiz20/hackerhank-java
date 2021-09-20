package com.hackerhank.joao.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class MergeSortTest {

    @Test
    public void shouldMergeSort0() {
        Integer[] unsorted = new Integer[]{6, 20, 8, 19, 56, 23, 87, 41, 49, 53};

        Integer[] result = MergeSort.mergeSort(unsorted);

        assertThat(result).isEqualTo(new Integer[]{6, 8, 19, 20, 23, 41, 49, 53, 56, 87});
    }

    @Test
    public void shouldMergeSort1() {
        Integer[] unsorted = new Integer[]{1, 5, 3, 7};

        Integer[] result = MergeSort.mergeSort(unsorted);

        assertThat(result).isEqualTo(new Integer[]{1, 3, 5, 7});
    }
}