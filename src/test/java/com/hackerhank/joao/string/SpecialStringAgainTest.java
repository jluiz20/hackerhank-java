package com.hackerhank.joao.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SpecialStringAgainTest {

    @Test
    public void shouldTestS0() {
        long result = SpecialStringAgain.substrCount(5, "asasd");

        assertThat(result).isEqualTo(7);
    }

    @Test
    public void shouldTestS1() {
        long result = SpecialStringAgain.substrCount(7, "abcbaba");

        assertThat(result).isEqualTo(10);
    }

    @Test
    public void shouldTestS2() {
        long result = SpecialStringAgain.substrCount(4, "aaaa");

        assertThat(result).isEqualTo(10);
    }
}