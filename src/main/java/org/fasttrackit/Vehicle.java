package org.fasttrackit;

public class Vehicle {

    String name;
    double milage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate (double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h.");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance;

        // same result as the above statement
//        traveledDistance += distance;

        double usedFuel = distance * milage / 100;

        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);


        return distance;

    }
}

