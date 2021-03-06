package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {
    private char suit;
    private int cardValue;

    public Card(int cardValue, char suit) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "|" + suit + cardValue + "|";
    }
}
