package org.example.solid_principles.interface_segregation_principle.problem;

public class Calculator implements UtilityService{
    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    @Override
    public void mul() {

    }

    @Override
    public void div() {

    }

    @Override
    public void weatherNow() {
        // this method is not related to calculator
    }

    @Override
    public void searchCity() {
        // this method is not related to calculator
    }
}
