package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {
    private static Scanner scanner = new Scanner(System.in);
    private static Deck deck = new Deck();
    private static Player user = new Player("", 2000);
    private static Player computer = new Player("Computer", 2000);

    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();
        user.setName(userName);

        showMenu();

    }

    private static void showMenu() {
        boolean running = true;
        deck.pupulateDeck();
        while (running) {
            System.out.println("Please choose an option: ");
            System.out.println("1 - Play a game" +
                    "\n2 - quit" +
                    "\n3 - reset deck");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    if(deck.getUsedCards().size() > 42){
                        System.out.println("The deck is almost empty. Only " + deck.getUsedCards().size() + " cards remaining. Resetting deck");
                        deck.setUsedCards(new ArrayList<>());
                        deck.setCards(new Card[52]);
                        deck.pupulateDeck();
                        Player.gamesPlayed++;
                    }
                    runGame();
                    break;
                case 2:
                    running = false;
                    break;
                case 3:
                    deck.setUsedCards(new ArrayList<>());
                    deck.setCards(new Card[52]);
                    deck.pupulateDeck();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private static boolean anotherOne(String option) {
        if (option.equalsIgnoreCase("yes")) {
            return true;
        } else if (option.equalsIgnoreCase("no")) {
            return false;
        } else {
            System.out.println("Invalid option.");
            return false;
        }
    }

    private static void populateHand() {
        user.setHand(new Hand());
        computer.setHand(new Hand());
        for (int i = 0; i < 2; i++) {
            deck.deal(user);
            deck.deal(computer);
        }
    }

    private static void displayHands(Player user, Player computer) {
        System.out.println("User hand: " + user.getHand().getCards().toString());
        System.out.println("Computer hand: " + computer.getHand().getCards().toString());
    }

    private static void runGame() {
        boolean playingHand = true;
        boolean wantsAnotherOne = true;

        outerloop:
        while (playingHand) {
            populateHand();
            while (wantsAnotherOne) {
                System.out.println(user.getHand().getCards().toString());
                System.out.println("Would you like another card?");
                String answer = scanner.nextLine();
                boolean oneMore = anotherOne(answer);
                if (oneMore) {
                    deck.deal(user);
                    System.out.println("User hand: " + user.getHand().getCards().toString());
                    System.out.println("User hand score: " + user.getHand().handScore());
                    if (user.getHand().handValueOver()) {
                        System.out.println("You went over 21! Computer wins!");
                        System.out.println("Hand score: " + user.getHand().handScore());
                        Player.computerWon++;
                        wantsAnotherOne = false;
                        playingHand = false;
                        break outerloop;
                    }
                } else {
                    wantsAnotherOne = false;
                    break;
                }
            }
            while (computer.computerAI()) {
                deck.deal(computer);
                if (computer.getHand().handValueOver()) {
                    System.out.println("COMPUTER WENT OVER! USER WINS!");
                    System.out.println("Computer hand: " + computer.getHand().getCards().toString());
                    System.out.println("Computer hand score: " + computer.getHand().handScore());
                    Player.playerWon++;
                    playingHand = false;
                    break outerloop;
                }
            }
            System.out.println("Nobody wants another card. Revealing hands: ");
            System.out.println("User hand: " + user.getHand().getCards().toString());
            System.out.println("User hand score: " + user.getHand().handScore());
            System.out.println("Computer hand: " + computer.getHand().getCards().toString());
            System.out.println("Computer hand score: " + computer.getHand().handScore());
            if (user.getHand().handScore() > computer.getHand().handScore()) {
                System.out.println(user.getName() + " wins this round with a score of " + user.getHand().handScore());
                Player.playerWon++;
                break;
            } else if (user.getHand().handScore() < computer.getHand().handScore()) {
                System.out.println("Computer wins this round with a score of " + computer.getHand().handScore());
                Player.computerWon++;
                break;
            } else {
                System.out.println("This one ends in a draw.");
                break;
            }
        }
    }

}
