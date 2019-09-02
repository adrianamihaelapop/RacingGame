package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        Car car = new Car(engine);
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.milage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";



        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        car.accelerate(60, 1);


        Car car2 = new Car(new Engine());
        car2.name = "Golf";
        car.fuelLevel = 75;
        car.milage = 9.7;
        car.doorCount = 8;
        car.maxSpeed = 230;
        car.fuelType = "High";

        car.name = "Skoda";
        car.name = null;

        //concatenantion


        System.out.println("Car2 name" + car2.name);
        System.out.println("Car2 name" + car.name);

        car = car2;



    }
        // this is a one-line comment
    }



