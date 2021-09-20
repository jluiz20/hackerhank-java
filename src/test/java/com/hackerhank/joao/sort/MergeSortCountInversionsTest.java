package com.hackerhank.joao.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class MergeSortCountInversionsTest {

    @Test
    public void shouldMergeSort0() {
        List<Integer> unsorted = Arrays.asList(2, 1, 3, 1, 2);

        long inversions = MergeSortCountInversions.countInversions(unsorted);

        assertThat(inversions).isEqualTo(4);
    }

    @Test
    public void shouldMergeSort1() {
        List<Integer> unsorted = Arrays.asList(1, 1, 1, 2, 2);

        long inversions = MergeSortCountInversions.countInversions(unsorted);

        assertThat(inversions).isEqualTo(0);
    }

    @Test
    public void shouldMergeSort2() {
        List<Integer> unsorted = Arrays.asList(1, 5, 3, 7);

        long inversions = MergeSortCountInversions.countInversions(unsorted);

        assertThat(inversions).isEqualTo(1);
    }
}