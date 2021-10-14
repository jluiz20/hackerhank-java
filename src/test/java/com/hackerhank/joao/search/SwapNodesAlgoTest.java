package com.hackerhank.joao.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SwapNodesAlgoTest {

    @Test
    public void shouldTestT1() {
        List<List<Integer>> lists = SwapNodesAlgo.swapNodes(
                asList(asList(2, 3), asList(-1, -1), asList(-1, -1)), asList(1, 1));

        assertThat(lists.get(0)).isEqualTo(asList(3, 1, 2));
        assertThat(lists.get(1)).isEqualTo(asList(2, 1, 3));
    }

    @Test
    public void shouldTestT2() {
        List<List<Integer>> lists = SwapNodesAlgo.swapNodes(
                asList(asList(2, 3),
                        asList(4, -1),
                        asList(5, -1),
                        asList(6, -1),
                        asList(7, 8),
                        asList(-1, 9),
                        asList(-1, -1),
                        asList(10, 11),
                        asList(-1, -1),
                        asList(-1, -1),
                        asList(-1, -1)
                ), asList(2, 4));

        assertThat(lists.get(0)).isEqualTo(asList(2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10));
        assertThat(lists.get(1)).isEqualTo(asList(2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11));
    }
}
