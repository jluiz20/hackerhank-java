package com.hackerhank.joao.hashmaps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class SherlockAnagramsTest {

    @Test
    public void sherlockAndAnagrams0() {
        Integer result = SherlockAnagrams.sherlockAndAnagrams("abba");

        assertThat(result).isEqualTo(4);
    }

    @Test
    public void sherlockAndAnagrams1() {
        Integer result = SherlockAnagrams.sherlockAndAnagrams("abcd");

        assertThat(result).isEqualTo(0);
    }

}