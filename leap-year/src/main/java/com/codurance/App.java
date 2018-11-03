package com.codurance;

public class App {

    public static void main( String[] args ) {
        int[] years = {1997, 1996, 1600, 1800};

        for (int value : years) {
            LeapYear year = new LeapYear(value);

            Boolean result = year.isLeapYear();
            String output = "a leap year";

            System.out.println(
                    String.format("%d is %s",
                            value,
                            result ? output : "not " + output));
        }
    }
}
