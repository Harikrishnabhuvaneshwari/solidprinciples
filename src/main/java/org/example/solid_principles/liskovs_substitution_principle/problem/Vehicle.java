package org.example.solid_principles.liskovs_substitution_principle.problem;

/*
The Liskov substitution principle states that an object of a superclass
should be replaceable with an object of any of its subclasses.

*/
public abstract class Vehicle {
    void getAge() {
        System.out.println("Age : ");
    }

    void getOwners() {
        System.out.println("Owners : ");
    }

    void getFuelDetails() {
        System.out.println("Fuel Details : ");
    }

    void getBatteryDetails() {
        System.out.println("Battery Details : ");
    }
}
