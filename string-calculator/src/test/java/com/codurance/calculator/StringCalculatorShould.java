package com.codurance.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorShould {

    @Test
    public void return_zero_on_an_empty_string_input() {
        final StringCalculator calculator = new StringCalculator();

        final int actual = calculator.add("");

        assertEquals(0, actual);
    }

}
