package org.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleNumberShould {

    @Test
    void return_2_for_given_3_1_and_2() {
        int actual = MiddleNumber.of(3, 1, 2);

        assertThat(actual).isEqualTo(2);
    }
}
