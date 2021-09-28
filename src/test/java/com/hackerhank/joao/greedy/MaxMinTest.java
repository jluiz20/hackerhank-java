package com.hackerhank.joao.greedy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MaxMinTest {

    @Test
    public void shouldTestT16() {
        int result = MaxMin.maxMin(3, asList(100, 200, 300, 350, 400, 401, 402));

        assertThat(result).isEqualTo(2);
    }

}