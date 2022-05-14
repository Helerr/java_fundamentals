package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards;
    private ArrayList<Integer> usedCards;
    private char[] symbols = new char[]{'♠', '♦', '♥', '♣'};

    public Deck() {
        this.cards = new Card[52];
        this.usedCards = new ArrayList<>();
    }

    public void pupulateDeck(){
        fillDeck();
    }
    private void fillDeck(){
        int value = 0;
        int j = 0;
        for (int i = 0; i < 52; i++) {
            value = i / 4;
            if (value + 1 > 9) {
                value = 9;
            }
            if (j > 3){
                j = 0;
            }
            char suit = symbols[j];
            cards[i] = new Card(value+1, suit);
            j++;
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards.toString() +
                '}';
    }
    public void deal(Player player){
        Random random = new Random();
        boolean checking = true;
        int cardNumber = random.nextInt(52);
        while (checking) {
            if (usedCards.contains(cardNumber)) {
                cardNumber = random.nextInt(52);
            } else {
                checking = false;
                this.usedCards.add(cardNumber);
            }
        }
        player.getHand().getCards().add(this.cards[cardNumber]);
        player.getHand().handScore();
    }



}
