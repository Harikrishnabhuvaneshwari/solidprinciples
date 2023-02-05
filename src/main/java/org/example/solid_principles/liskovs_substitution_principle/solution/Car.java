package org.example.solid_principles.liskovs_substitution_principle.solution;

public class Car extends FuelableVehicle {
    @Override
    void getAge() {
        super.getAge();
        // age
    }

    @Override
    void getOwners() {
        super.getOwners();
        // owners
    }

    @Override
    void getFuelDetails() {
        super.getFuelDetails();
        // fuel details
    }

}
