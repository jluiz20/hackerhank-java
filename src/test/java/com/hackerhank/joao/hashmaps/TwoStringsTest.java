package com.hackerhank.joao.hashmaps;

import com.hackerhank.joao.arrays.LeftRotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TwoStringsTest {

    @Test
    public void twoStrings0() {
        String result = TwoStrings.twoStrings("hello", "world");

        assertThat(result).isEqualTo("YES");
    }

}