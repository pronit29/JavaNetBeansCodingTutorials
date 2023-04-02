package com.basic.codes.javatutorial.Challenges.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

    @Override
    public String toString(){
        return String.format("%s (%d)", name, distance);
    }

}

public class InteractiveConsoleUsingLinkedList {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit,adelaide);
        addPlace(placesToVisit,new Place("adelaide",1374));
        addPlace(placesToVisit,new Place("Brisbane",917));
        addPlace(placesToVisit,new Place("Perth",3923));
        addPlace(placesToVisit,new Place("Alice Springs",2771));
        addPlace(placesToVisit,new Place("Darwin",3972));
        addPlace(placesToVisit,new Place("Melbourne",877));

        placesToVisit.addFirst(new Place("Sydney",0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        boolean quitLoop = false;
        boolean forward = true;

       // userAction();

    }

    public static void userAction() {
        System.out.println("Available actions (select word or letter" + "\n" +
                "(F)orward" + "\n" +
                "(B)ackward" + "\n" +
                "(L)ist Places" + "\n" +
                "(Q)uit");
        System.out.print("Please select an option from the above list of action items: ");
        Scanner sc = new Scanner(System.in);
        String inputChoice = sc.next();

        switch (inputChoice) {
            case "F", "f", "Forward", "forward" -> {}
            case "B", "b", "Backward", "backward" -> {}
            case "L", "l", "List Places", "List places", "list places" -> {}
            case "Q", "q", "Quit", "quit" -> {
                return;
            }
            default -> {
                System.err.println("Please select a valid option from the above list of action items");
            }
        };

    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        for(Place p : list) {
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found Duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }


}
