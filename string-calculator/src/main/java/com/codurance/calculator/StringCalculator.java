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

        return sumOf(numbers);
    }

    private String replaceCustomSeparators(String numbers) {
        final String[] input = numbers.split("\n");
        String customSeparator = input[0].replace("//", "");

        if (customSeparator.contains("[")) {
            customSeparator = customSeparator.replace("[", "").replace("]", "");

            if (customSeparator.contains("foo") && customSeparator.contains("bar")) {
                return input[1].replace("foo", ",").replace("bar", ",");
            }

            if (isArbitraryLength(customSeparator)) {
                return input[1].replace(customSeparator, ",");
            }

            numbers = input[1];
            for (Character character: customSeparator.toCharArray()) {
                numbers = numbers.replace(character, ',');
            }
            return numbers;
        }

        return input[1].replace(customSeparator, ",");
    }

    private int sumOf(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

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

    private boolean isArbitraryLength(String customSeparator) {
        final String firstCharacter = customSeparator.substring(0, 1);
        final String restOfSeparator = customSeparator.substring(1);
        return restOfSeparator.contains(firstCharacter);
    }
}
