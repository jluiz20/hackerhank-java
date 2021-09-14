package com.hackerhank.joao.arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class NewYearChaosTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void minimumBribesTooChaotic() {
        NewYearChaos.minimumBribes(List.of(2, 5, 1, 3, 4));

        assertThat("Too chaotic").isEqualTo(outputStreamCaptor.toString().trim());
    }

    @Test
    public void minimumBribesTest1() {
        NewYearChaos.minimumBribes(List.of(2, 1, 5, 3, 4));

        assertThat(outputStreamCaptor.toString().trim()).isEqualTo("3");
    }

    @Test
    public void minimumBribesTest2() {
        NewYearChaos.minimumBribes(List.of(1, 2, 5, 3, 7, 8, 6, 4));

        assertThat(outputStreamCaptor.toString().trim()).isEqualTo("7");
    }
}
