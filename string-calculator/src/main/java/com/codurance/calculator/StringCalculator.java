package com.codurance.calculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        if (numbers.equals("0")) {
            return 0;
        }

        if (numbers.equals("1")) {
            return 1;
        }

        if (numbers.equals("2")) {
            return 2;
        }

        throw new UnsupportedOperationException("Not yet implemented");
    }
}
