package org.example.solid_principles.single_responsibility_principle.problem;

/*
BankService class here is not responsible for bank service alone as we can see it also has
card and notification related services. Single Responsibility Principle states that a class
is responsible for a single service related operations. But here BankService class not followed
this principle, we can see the solution for this in solution folder.
*/
public class BankService {

    public void showBankServices() {
        // show bank services
    }

    public void showCardOffers() {
        // show card offers
    }

    public void sendOTP() {
        // send OTP
    }

    public void showCardDetails() {
        // show all card details
    }
}
