package org.example.solid_principles.interface_segregation_principle.problem;

/*
Interface Segregation Principle states that an interface should not contain methods
which are not related to each other because when we implement this interface for a purpose
we fail to end leaving few methods empty.

Pblm :
Calulator and MyWeather implement UtilityService, UtilityService interface has methods which serv diff purpose
and are not related. Now both Calulator and MyWeather classes end up leaving few methods empty. This is a bad design.

Sol :
Segregate the interfaces based on the purpose. This will improve the code quality and readability.
Here, we divide below interface into multiple interfaces each serves a single purpose.

*/
public interface UtilityService {
    void add();
    void sub();
    void mul();
    void div();
    void weatherNow();
    void searchCity();
}
