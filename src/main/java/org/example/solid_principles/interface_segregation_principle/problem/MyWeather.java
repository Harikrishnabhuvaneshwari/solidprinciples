package org.example.solid_principles.interface_segregation_principle.problem;

public class MyWeather implements UtilityService {
    @Override
    public void add() {
        // this method is not related to weather app
    }

    @Override
    public void sub() {
        // this method is not related to weather app
    }

    @Override
    public void mul() {
        // this method is not related to weather app
    }

    @Override
    public void div() {
        // this method is not related to weather app
    }

    @Override
    public void weatherNow() {

    }

    @Override
    public void searchCity() {

    }
}
