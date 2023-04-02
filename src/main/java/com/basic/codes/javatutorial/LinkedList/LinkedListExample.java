package com.basic.codes.javatutorial.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
//        gettingElements(placesToVisit);

//        printItinerary2(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); //Removes the first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); //Removes the first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); //Removes the first element
        System.out.println(s3 + " was removed");

        //Queue/Dequeue methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Melbourne");
        list.push("Canberra");
        list.push("Sydney");
        System.out.println(list);

        String po1 = list.pop(); //Removes the first element
        System.out.println(po1 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved element: " + list.get(4));
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        //Queue methods
        System.out.println("Element from element(): " + list.element());
        //Stack methods
        System.out.println("Element from peek(): " + list.peek());
        System.out.println("Element from peekFirst(): " + list.peekFirst());
        System.out.println("Element from peekLast(): " + list.peekLast());

    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary1(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();

            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        var iterator1 = list.listIterator(3);
        System.out.println("Second iterator instance: " + iterator1.next());
        System.out.println(list);
    }
}
