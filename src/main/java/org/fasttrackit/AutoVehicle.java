package org.fasttrackit;

public class AutoVehicle extends  Vehicle {

    // has-a realtionship
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
