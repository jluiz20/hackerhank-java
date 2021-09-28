package com.hackerhank.joao.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CommonChildTest {

    @Test
    public void shouldTestS0() {
        long result = CommonChild.commonChild("HARRY", "SALLY");

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldTestS1() {
        long result = CommonChild.commonChild("AA", "BB");

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldTestS2() {
        long result = CommonChild.commonChild("SHINCHAN", "NOHARAAA");

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldTestS3() {
        long result = CommonChild.commonChild("ABCDEF", "FBDAMN");

        assertThat(result).isEqualTo(2);
    }
}
