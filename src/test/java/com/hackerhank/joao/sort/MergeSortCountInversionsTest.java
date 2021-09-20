package com.hackerhank.joao.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class MergeSortCountInversionsTest {

    @Test
    public void shouldMergeSort0() {
        Integer[] unsorted = new Integer[]{2, 1, 3, 1, 2};

        long inversions = MergeSortCountInversions.countInversions(unsorted);

        assertThat(inversions).isEqualTo(4);
    }
}