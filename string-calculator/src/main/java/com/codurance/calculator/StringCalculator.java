package com.codurance.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {

        String separator = ",";

        if (numbers.startsWith("//")) {
            final String[] input = numbers.split("\n");

            separator = input[0].replace("//", "");
            numbers = input[1];
        }

        if (numbers.contains("\n")) {
            numbers = numbers.replace("\n", ",");
        }

        if (numbers.contains(separator)) {
            return add(numbers, separator);
        }

        if (numbers.equals("")) {
            return 0;
        }

        return Integer.parseInt(numbers);
    }

    private int add(String numbers, String separator) {
        final String[] values = numbers.split(separator);
        final List<String> negatives = new ArrayList<>();
        int sum = 0;
        for (String value: values) {
            final int integerValue = Integer.parseInt(value);
            if (integerValue < 0) {
                negatives.add(value);
            }
            if (integerValue < 100) {
                sum = sum + integerValue;
            }
        }

        if (! negatives.isEmpty()) {
            throw new IllegalArgumentException(
                    "error: negatives not allowed: " + String.join(" ", negatives));
        }

        return sum;
    }
}
