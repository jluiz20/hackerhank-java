package com.hackerhank.joao.greedy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class LuckBalanceTest {
    @Test
    public void shouldTestS0() {
//        [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]]
        int result = LuckBalance.luckBalance(3,
                asList(asList(5, 1), asList(2, 1), asList(1, 1), asList(8, 1), asList(10, 0), asList(5, 0)));

        assertThat(result).isEqualTo(29);
    }

}