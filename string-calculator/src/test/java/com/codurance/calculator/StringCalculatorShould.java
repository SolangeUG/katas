package com.codurance.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorShould {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void return_zero_on_an_empty_string_input() {

        final int actual = calculator.add("");

        assertEquals(0, actual);
    }

    @Test
    public void return_zero_on_an_input_string_of_zero() {

        final int actual = calculator.add("0");

        assertEquals(0, actual);
    }

    @Test
    public void return_one_on_an_input_string_of_one() {

        final int actual = calculator.add("1");

        assertEquals(1, actual);
    }

    @Test
    public void return_two_on_an_input_string_of_two() {

        final int actual = calculator.add("2");

        assertEquals(2, actual);
    }

    @Test
    public void return_three_on_an_input_string_of_one_and_two() {

        final int actual = calculator.add("1,2");

        assertEquals(3, actual);
    }

    @Test
    public void return_sum_of_all_values_in_an_arbitrary_input_string_size() {

        final int actual = calculator.add("1,2,3,4,5,6,7,8,9");

        assertEquals(45, actual);
    }
}
