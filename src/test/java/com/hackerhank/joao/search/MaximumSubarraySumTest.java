package com.hackerhank.joao.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MaximumSubarraySumTest {

    @Test
    public void shouldTestT0() {
        long result = MaximumSubarraySum.maximumSum(Arrays.asList(3L, 3L, 9L, 9L, 5L), 7);

        assertThat(result).isEqualTo(6);
    }

}