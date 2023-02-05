package org.example.solid_principles.open_closed_principle.problem;

/*
A class/interface should be open for extension but closed for modification.

pblm:
Here in the below example, Mobile class initially had call and sms funcs
later someone comes in and implements iCloud func for a purpose that is not
required for all mobiles, after a while again someone comes in and implements
googleDrive func for a purpose that is not required for all mobiles.

sol:
To avoid this kind of modifications to a class which has few generic
methods, we can extend this class further and implement our logic there
without disturbing others.

*/
public class Mobile {

    public void call() {
        // call
    }

    public void sms() {
        // sms
    }

    public void iCloud() {
        // apple's iCloud
    }

    public void googleDrive() {
        // google's drive
    }

}
