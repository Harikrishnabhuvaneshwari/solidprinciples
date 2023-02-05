package org.example.solid_principles.liskovs_substitution_principle.solution;

public abstract class Vehicle {
    void getAge() {
        System.out.println("Age : ");
    }

    void getOwners() {
        System.out.println("Owners : ");
    }
}