package com.ab._12Collection;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 12);
        int val = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        System.out.println("Sum of doubled even numbers: " + val);
    }
}
