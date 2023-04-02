package com.basic.codes.javatutorial.Enums;

import java.util.Random;

public class Days {

    public static void main(String[] args) {

        DaysOfTheWeek week = DaysOfTheWeek.TUESDAY;
        System.out.println(week);

        for(int i = 0; i< 10; i++) {
            week = getRandomDay();
            //System.out.printf("Name is %s, Ordinal Value = %d%n", week.name(), week.ordinal());
//            if(week == DaysOfTheWeek.FRIDAY) {
//                System.out.println("Found a Friday!!!!");
            switchDaysOfWeek(week);
            }

        for(Toppings topping : Toppings.values()) {
            System.out.println(topping.name() + ": " + topping.getPrice());
        }
        }

    public static DaysOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();
        return allDays[randomInteger];
    }

    public static void switchDaysOfWeek(DaysOfTheWeek weekDay) {
        int week = weekDay.ordinal() + 1;
        switch(weekDay) {
            case WEDNESDAY -> {
                System.out.println("Day is a Wednesday " + week);
            }
            case SATURDAY -> {
                System.out.println("Day is a Saturday " + week);
            }
            default -> {
                System.out.println(weekDay.name().charAt(0) +
                        weekDay.name().substring(1).toLowerCase() +
                        " is Day " + week);
            }
        }
    }
}
