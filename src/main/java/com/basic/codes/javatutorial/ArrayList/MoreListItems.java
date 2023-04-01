package com.basic.codes.javatutorial.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MoreListItems {

    public static void main(String[] args) {

        String[] items = {"apple", "mango", "banana", "oranges"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "shake","mustard"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println(groceries.get(2));

        groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println("First index of yogurt in the list: " + groceries.indexOf("yogurt"));
        System.out.println("Last index of yogurt in the list: " + groceries.lastIndexOf("yogurt"));
    }
}
