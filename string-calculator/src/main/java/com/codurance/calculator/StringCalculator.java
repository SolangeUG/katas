package com.codurance.calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {

        if (numbers.startsWith("//")) {
            numbers = replaceCustomSeparators(numbers);
        }

        if (numbers.contains("\n")) {
            numbers = numbers.replace("\n", ",");
        }

        if (numbers.contains(",")) {
            return sumOf(numbers);
        }

        if (numbers.equals("")) {
            return 0;
        }

        return Integer.parseInt(numbers);
    }

    private String replaceCustomSeparators(String numbers) {
        final String[] input = numbers.split("\n");
        final String customSeparator = input[0]
                .replace("//", "")
                .replace("[", "")
                .replace("]", "");
        numbers = input[1].replace(customSeparator, ",");
        return numbers;
    }

    private int sumOf(String numbers) {
        final String[] values = numbers.split(",");
        final List<String> negatives = new ArrayList<>();
        int sum = 0;
        for (String value: values) {
            final int number = Integer.parseInt(value);
            if (number < 0) {
                negatives.add(value);
            }
            if (number < 1000) {
                sum = sum + number;
            }
        }

        if (! negatives.isEmpty()) {
            throw new IllegalArgumentException(
                    "error: negatives not allowed: " + String.join(" ", negatives));
        }

        return sum;
    }
}
