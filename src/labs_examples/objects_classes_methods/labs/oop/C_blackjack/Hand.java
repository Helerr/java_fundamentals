package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int handValue;

    public Hand() {
        this.cards = new ArrayList<>();
        this.handValue = 0;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }

    public int handScore(){
        int score = 0;
        for (Card card : this.cards) {
            score += card.getCardValue();
        }
        this.handValue = score;
        return score;
    }

    public boolean handValueOver(){
        if (handScore() > 21){
            return true;
        } else {
            return false;
        }
    }

}
