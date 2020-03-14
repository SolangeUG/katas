package com.codurance.calculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.contains(",")) {
            final String[] values = numbers.split(",");
            return Integer.parseInt(values[0]) + Integer.parseInt(values[1]);
        }

        if (numbers.equals("")) {
            return 0;
        }

        return Integer.parseInt(numbers);
    }
}
