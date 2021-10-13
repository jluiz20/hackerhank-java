package com.hackerhank.joao.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TripleSumTest {

    @Test
    public void shouldTestT0() {
        long result = TripleSum.triplets(new int[]{1, 3, 5}, new int[]{2, 3}, new int[]{1, 2, 3});

        assertThat(result).isEqualTo(8);
    }

    @Test
    public void shouldTestT1() {
        long result = TripleSum.triplets(new int[]{1, 4, 5}, new int[]{2, 3, 3}, new int[]{1, 2, 3});

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void shouldTestT2() {
        long result = TripleSum.triplets(new int[]{1, 3, 5, 7}, new int[]{5, 7, 9}, new int[]{7, 9, 11, 13});

        assertThat(result).isEqualTo(12);
    }
}
