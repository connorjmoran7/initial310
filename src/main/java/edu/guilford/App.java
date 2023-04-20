package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Accord");

        // Create an ArrayList to store the cars in
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);

        // Create 5 new cars and add them to the ArrayList
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            cars.add(car);
        }
        // Print out the cars in the ArrayList
        for (Car car : cars) {
            System.out.println(car.toString());
        }

        // Run the method analyze on the all of the cars in the ArrayList and print out
        // the score

        System.out.println("\nThe best possible score is 30.\n");

        for (Car car : cars) {
            System.out.println(car.analyze());
        }
    }
}
