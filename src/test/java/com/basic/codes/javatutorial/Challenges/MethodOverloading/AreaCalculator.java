/*
 * Step 1 - Create a method area which accepts one parameter of type double and also returns a double value
 * Step 2 - Calculate the area of a circle --> Math.PI * radius * radius
 * Step 3 - Check if the radius is negative. If it is negative then return -1
 * Step 4 - Create another method with the same name area which accepts two parameters of type double and also returns a double value
 * Step 5 - Calculate the area of a rectangle --> side1 * side2
 * Step 6 - Check if either or both the sides are negative. If it is negative then return -1
 */
package com.basic.codes.javatutorial.Challenges.MethodOverloading;

/**
 *
 * @author Pronit Kundu
 */
public class AreaCalculator {

    public static double area(double radius) {
        double areaOfCircle;
        if (radius > 0) {
            areaOfCircle = Math.PI * radius * radius;
            return areaOfCircle;
        } else {
            return -1;
        }
    }

    public static double area(double length, double breadth) {
        double areaOfRectangle;
        if ((length > 0) && (breadth > 0)) {
            areaOfRectangle = length * breadth;
            return areaOfRectangle;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Area of the circle: " + area(-1.0));
        System.out.println("Area of the rectangle: " + area(-1.0, 4.0));
    }

}
