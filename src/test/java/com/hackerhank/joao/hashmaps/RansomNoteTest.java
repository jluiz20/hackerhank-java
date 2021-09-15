package com.hackerhank.joao.hashmaps;

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
public class RansomNoteTest {

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
    public void checkMagazine() {
        RansomNote.checkMagazine(
                List.of("give", "me", "one", "grand", "today", "night"),
                List.of("give", "one", "grand", "today"));

        assertThat("Yes").isEqualTo(outputStreamCaptor.toString().trim());
    }

    @Test
    public void checkMagazine1() {
        RansomNote.checkMagazine(
                List.of("two", "times", "three", "is", "not", "four"),
                List.of("two", "times", "two", "is", "four"));

        assertThat("No").isEqualTo(outputStreamCaptor.toString().trim());
    }
}