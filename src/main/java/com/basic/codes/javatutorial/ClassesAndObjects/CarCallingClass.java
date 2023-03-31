/*
 * This class creates an object of the Car class and uses the attributes of the Car class
 */
package com.basic.codes.javatutorial.ClassesAndObjects;

/**
 *
 * @author Pronit Kundu
 */
public class CarCallingClass {
    
    public static void main(String[] args) {
        
        Car car = new Car();
        car.setColor("Red");
        car.setMake("Porshe");
        car.setDoors(2);
        car.setConvertible(true);
        car.describeCar();
        
        Car targa = new Car();
        targa.setColor("Red");
        targa.setMake("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();
    }
}
