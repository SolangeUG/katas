package com.codurance;

class LeapYear {

    private int year;

    LeapYear(int year) {
        this.year = year;
    }

    Boolean isLeapYear() {
        boolean result;
        if (isDivisibleBy(100))
            return isDivisibleBy(400);

        result = isDivisibleBy(4);
        return result;
    }

    private boolean isDivisibleBy(int divisor) {
        return year % divisor == 0;
    }
}
