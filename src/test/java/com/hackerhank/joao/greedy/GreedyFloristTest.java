package com.hackerhank.joao.greedy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GreedyFloristTest {

    @Test
    public void shouldTestS0() {
        int result = GreedyFlorist.getMinimumCost(3, new int[]{2, 5, 6});

        assertThat(result).isEqualTo(13);
    }

    @Test
    public void shouldTestT0() {
        int result = GreedyFlorist.getMinimumCost(2, new int[]{2, 5, 6});

        assertThat(result).isEqualTo(15);
    }
}