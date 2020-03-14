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

    @Test
    public void return_zero_on_an_input_string_of_zero() {
        final StringCalculator calculator = new StringCalculator();

        final int actual = calculator.add("0");

        assertEquals(0, actual);
    }

    @Test
    public void return_one_on_an_input_string_of_one() {
        final StringCalculator calculator = new StringCalculator();

        final int actual = calculator.add("1");

        assertEquals(1, actual);
    }

    @Test
    public void return_two_on_an_input_string_of_two() {
        final StringCalculator calculator = new StringCalculator();

        final int actual = calculator.add("2");

        assertEquals(2, actual);
    }
}
