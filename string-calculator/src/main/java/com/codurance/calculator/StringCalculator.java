package com.codurance.calculator;

public class StringCalculator {

    public int add(String numbers) {

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
