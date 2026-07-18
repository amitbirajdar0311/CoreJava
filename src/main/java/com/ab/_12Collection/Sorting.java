package com.ab._12Collection;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 23, 38, 41, 52);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Comparator<Integer> comp = (o1, o2) -> o1 % 10 - o2 % 10;

        Collections.sort(list, comp);
        System.out.println("Sorted List by last digit: " + list);

    }
}
