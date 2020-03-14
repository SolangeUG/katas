package com.codurance.calculator;

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
        int sum = 0;
        for (String value: values) {
            sum = sum + Integer.parseInt(value);
        }
        return sum;
    }
}
