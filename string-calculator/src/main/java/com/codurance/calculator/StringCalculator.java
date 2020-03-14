package com.codurance.calculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers) {

        if (numbers.startsWith("//")) {
            final char separator = numbers.charAt(2);
            final String[] input = numbers.split("\n");
            final String values = input[1];

            final String replaced = values.replace(separator, ',');
            return add(replaced);
        }

        if (numbers.contains("\n")) {
            final String replaced = numbers.replace("\n", ",");
            return add(replaced);
        }

        if (numbers.contains(",")) {
            final String[] values = numbers.split(",");
            int sum = 0;
            for (String value: values) {
                sum = sum + Integer.parseInt(value);
            }
            return sum;
        }

        if (numbers.equals("")) {
            return 0;
        }

        return Integer.parseInt(numbers);
    }
}
