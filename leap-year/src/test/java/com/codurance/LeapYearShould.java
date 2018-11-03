package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearShould {

    @Test
    public void return_false_when_input_year_is_not_divisible_by_4() {
        LeapYear year = new LeapYear(1997);
        assertThat(year.isLeapYear(), is(Boolean.FALSE));
    }

    @Test
    public void return_true_when_input_year_is_divisible_by_4() {
        LeapYear year = new LeapYear(1996);
        assertThat(year.isLeapYear(), is(Boolean.TRUE));
    }

    @Test
    public void return_true_when_input_year_is_divisible_by_400() {
        LeapYear year = new LeapYear(2000);
        assertThat(year.isLeapYear(), is(Boolean.TRUE));
    }

    @Test
    public void return_false_when_input_year_is_divisible_by_100_but_not_400() {
        LeapYear year = new LeapYear(1800);
        assertThat(year.isLeapYear(), is(Boolean.FALSE));
    }
}
