package com.hackerhank.joao.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ArrayManipulationTest {

    @Test
    public void arrayManipulation0() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 2, 100),  Arrays.asList(2, 5, 100),  Arrays.asList(3, 4, 100));
        long maxValue = ArrayManipulation.arrayManipulation(5, queries);

        assertThat(maxValue).isEqualTo(200l);
    }

}