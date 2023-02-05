package org.example.solid_principles.liskovs_substitution_principle.solution;

public class Driver {
    public static void main(String[] args) {

        // here we can replace vehicle with BiCycle or Car objects
        Vehicle vehicle = new BiCycle();
        //Vehicle vehicle = new Car();

        // here we can replace fuelableVehicle with Car object or any fuel able vechiles.
        FuelableVehicle fuelableVehicle = new Car();

        vehicle.getAge();
        vehicle.getOwners();

        fuelableVehicle.getAge();
        fuelableVehicle.getOwners();
        fuelableVehicle.getFuelDetails();
    }
}
