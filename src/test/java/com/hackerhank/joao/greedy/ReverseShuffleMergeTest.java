package com.hackerhank.joao.greedy;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ReverseShuffleMergeTest {

    @Test
    public void shouldTestS0() {
        String result = ReverseShuffleMerge.reverseShuffleMerge("eggegg");

        assertThat(result).isEqualTo("egg");
    }

    @Test
    public void shouldTestS1() {
        String result = ReverseShuffleMerge.reverseShuffleMerge("abcdefgabcdefg");

        assertThat(result).isEqualTo("agfedcb");
    }

    @Test
    public void shouldTestS2() {
        String result = ReverseShuffleMerge.reverseShuffleMerge("aeiouuoiea");

        assertThat(result).isEqualTo("aeiou");
    }


}