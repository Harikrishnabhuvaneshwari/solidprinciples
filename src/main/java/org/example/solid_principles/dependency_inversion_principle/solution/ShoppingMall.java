package org.example.solid_principles.dependency_inversion_principle.solution;
public class ShoppingMall {

    private Card card;

    public ShoppingMall(Card debitCard) {
        this.card = debitCard;
    }

    public void swipe() {
        // check and pay
        card.pay();
    }

    public static void main(String[] args) {

        //Card card = new DebitCard();
        Card card = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(card);
        shoppingMall.swipe();
    }
}
