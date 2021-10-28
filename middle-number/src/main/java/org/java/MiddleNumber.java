package org.java;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MiddleNumber {
    public static int of(int x, int y, int z) {
        List<Integer> numbers = Arrays.asList(x, y, z);
        List<Integer> sorted = numbers.stream().sorted().collect(toList());
        return sorted.get(1);
    }
}
