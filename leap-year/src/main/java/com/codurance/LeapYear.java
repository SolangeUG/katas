package com.codurance;

class LeapYear {

    private int year;

    LeapYear(int year) {
        this.year = year;
    }

    Boolean isLeapYear() {
        boolean result;
        result = year % 4 == 0;
        return result;
    }
}
