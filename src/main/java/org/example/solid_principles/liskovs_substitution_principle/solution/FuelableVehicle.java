package org.example.solid_principles.liskovs_substitution_principle.solution;

public abstract class FuelableVehicle extends Vehicle{
    void getFuelDetails() {
        System.out.println("Fuel Details : ");
    }
}
