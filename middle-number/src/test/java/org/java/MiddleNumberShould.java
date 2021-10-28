package org.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleNumberShould {

    @Test
    void return_2_for_given_3_1_and_2() {
        int actual = MiddleNumber.of(3, 1, 2);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    void return_9_for_given_12_4_and_9() {
        int actual = MiddleNumber.of(12, 4, 9);

        assertThat(actual).isEqualTo(9);
    }

    @Test
    void return_9_for_given_9_4_and_12() {
        int actual = MiddleNumber.of(9, 4, 12);

        assertThat(actual).isEqualTo(9);
    }
}
