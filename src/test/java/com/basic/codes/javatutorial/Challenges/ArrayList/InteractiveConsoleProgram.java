package com.basic.codes.javatutorial.Challenges.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class InteractiveConsoleProgram {

    public static void main(String[] args) {
        userActions();
    }

    private static ArrayList addItemsToList() {
        String inputItems;
        boolean isDuplicate = false;

        Scanner sc1 = new Scanner(System.in);
        ArrayList<String> listOfItemsToBeAdded = new ArrayList<>();
        System.out.print("Enter the number of items you want to add in your list: ");
        String numberOfItems = sc1.next();
        if (Integer.parseInt(numberOfItems) == 0) {
            System.out.println("You are not wanting to add any items on the list");
        } else {
            System.out.print("Enter the items you want to add in the list: ");
            for (int i = 0; i < Integer.parseInt(numberOfItems); i++) {
                inputItems = sc1.next();
                listOfItemsToBeAdded.addAll(List.of(inputItems));
            }
            int arrayListSize = listOfItemsToBeAdded.size();

            for (int i = 0; i < arrayListSize; i++) {
                for (int j = 0; j < arrayListSize; j++) {
                    if ((i != j) && (listOfItemsToBeAdded.get(i).toString().equals(listOfItemsToBeAdded.get(j).toString()))) {
                        isDuplicate = true;

                    }
                }
                        if(isDuplicate) {
                            listOfItemsToBeAdded.remove(listOfItemsToBeAdded.get(i).toString());
                            break;
                        }
                    }
                }

            System.out.println("Items added in the list: " + listOfItemsToBeAdded);
            listOfItemsToBeAdded.sort(Comparator.naturalOrder());
            System.out.println("The list of items in the sorted order: " + listOfItemsToBeAdded);
        return listOfItemsToBeAdded;
        }

        public static void userActions () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Available actions: " + "\n" +
                    "0 - to shutdown" + "\n" +
                    "1 - to add item(s) to the list (comma delimited list)" + "\n" +
                    "2 - to remove any items (comma delimited list)");
            System.out.print("Enter a number for which action you want to do: ");
            int inputChoice = Integer.parseInt(sc.next());

            switch (inputChoice) {

                case 0 -> {
                    System.out.println("You selected option 0. You have been taken out of the program");
                    System.exit(0);
                }
                case 1 -> {
                    addItemsToList();
                }
                case 2 -> {
                    String deleteItems = "";
                    ArrayList<String> listOfItems = addItemsToList();
                    if (listOfItems.isEmpty()) {
                        System.out.println("There are not items in the list to be deleted");
                    } else {
                        System.out.println("Items currently there in the list: " + listOfItems);
                        System.out.print("Enter the items you want to delete from the list: ");
                        listOfItems.remove(deleteItems = sc.next());
                        System.out.println("Items in the list after the items have been removed: " + listOfItems);
                    }
                }
                default -> {
                    System.err.println("Please select a valid option");
                }
            }
        }
}

