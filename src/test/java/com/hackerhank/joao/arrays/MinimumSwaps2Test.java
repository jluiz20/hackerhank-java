package com.hackerhank.joao.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MinimumSwaps2Test {

    @Test
    public void minimumSwaps0() {
        int swaps = MinimumSwaps2.minimumSwaps(new int[]{1, 2, 3, 4, 5, 6, 7});

        assertThat(swaps).isEqualTo(0);
    }

    @Test
    public void minimumSwaps1() {
        int swaps = MinimumSwaps2.minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6});

        assertThat(swaps).isEqualTo(5);
    }

    @Test
    public void minimumSwaps2() {
        int swaps = MinimumSwaps2.minimumSwaps(new int[]{4, 3, 1, 2});

        assertThat(swaps).isEqualTo(3);
    }

}