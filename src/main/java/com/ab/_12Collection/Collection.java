package com.ab._12Collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        System.out.println("List: " + list);
////
//        // Add an element to the list
//        list.add(6);
//        System.out.println("After adding 6: " + list);
//
//        // Remove an element from the list
//        list.remove(Integer.valueOf(3));
//        System.out.println("After removing 3: " + list);
//
//        // Check if the list contains a specific element
//        boolean contains4 = list.contains(4);
//        System.out.println("List contains 4: " + contains4);
//
//        // Get the size of the list
//        int size = list.size();
//        System.out.println("Size of the list: " + size);
//
//        java.util.Iterator<Integer> itr  =list.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
////        set.forEach(System.out::println);
//
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        List<Integer> list = new ArrayList<>(set);
//        System.out.println("List: " + list);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map);

        System.out.println(map.keySet());
        for(Integer key : map.keySet()){
            System.out.println("key: " + key + " value: " + map.get(key));
        }
        System.out.println(map.values());

    }
}
