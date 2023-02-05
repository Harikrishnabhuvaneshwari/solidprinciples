package org.example.solid_principles.liskovs_substitution_principle.problem;

import java.util.Vector;

public class Car extends Vehicle {
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

    @Override
    void getBatteryDetails() {
        super.getBatteryDetails();
        // battery details
    }
}
