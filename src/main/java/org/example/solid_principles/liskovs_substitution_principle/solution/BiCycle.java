package org.example.solid_principles.liskovs_substitution_principle.solution;

public class BiCycle extends Vehicle {
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
}
