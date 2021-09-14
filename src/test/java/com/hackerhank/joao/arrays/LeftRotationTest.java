package com.hackerhank.joao.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)

public class LeftRotationTest {

    @Test
    public void rotLeft0() {
        List<Integer> rotated = LeftRotation.rotLeft(List.of(1, 2, 3, 4, 5, 6, 7), 2);

        assertThat(rotated).isEqualTo(List.of(3, 4, 5, 6, 7, 1, 2));
    }
}