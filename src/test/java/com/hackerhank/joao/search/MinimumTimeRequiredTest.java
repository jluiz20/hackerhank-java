package com.hackerhank.joao.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MinimumTimeRequiredTest {

    @Test
    public void shouldTestT0() {
        long result = MinimumTimeRequired.minTime(new long[]{2, 3}, 5);

        assertThat(result).isEqualTo(6);
    }
}
