package com.hackerhank.joao.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class FraudulentActivityTest {

    @Test
    public void activityNotifications0() {
        Integer result = FraudulentActivity.activityNotifications(Arrays.asList(1, 2, 3, 4, 4), 4);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void activityNotifications3() {
        Integer result = FraudulentActivity.activityNotifications(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5), 5);

        assertThat(result).isEqualTo(2);
    }
}