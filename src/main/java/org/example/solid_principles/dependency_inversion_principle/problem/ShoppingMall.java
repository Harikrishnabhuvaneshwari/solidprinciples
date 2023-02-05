package org.example.solid_principles.dependency_inversion_principle.problem;

/*
Dependency Inversion Principle states that objects must be loosely coupled.

pblm:
Here ShoppingMall object always depends on one type of card(debit card), suppose if a
customer gives credit card to swipe then we have to modify below code to add support for
credit card, this makes objects tightly coupled with each other.

sol:
Here we can avoid this tight coupling by introducing an interface which will support
all the implemented classes, here in our case we introduce Card interface to accept
any cards in future.
*/
public class ShoppingMall {

    private DebitCard card;

    public ShoppingMall(DebitCard debitCard) {
        this.card = debitCard;
    }

    public void swipe(){
        // check and pay
        card.pay();
    }

    public static void main(String[] args) {

        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.swipe();
    }
}
