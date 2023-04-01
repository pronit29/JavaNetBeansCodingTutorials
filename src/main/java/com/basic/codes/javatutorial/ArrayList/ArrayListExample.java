package com.basic.codes.javatutorial.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(),type);
    }
}

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCE", 5));
        groceryList.set(0,new GroceryItem("Apples", "PRODUCE", 10));
        groceryList.remove(1);
        System.out.println(groceryList);


    }

}
