package labs_examples.objects_classes_methods.labs.oop.D_my_oop.sharing_surprises;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.factory.GatherSurprises;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise.ISurprise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Engine {

    static ArrayList<GiveSurprises> giveSurprises = new ArrayList<>();

    public static void startMethod (Scanner sc){
        System.out.println("\t\t<<<Let's make some people happy!>>>");
        boolean keyword = true;

        while (keyword) {
            System.out.println("Choose what to do! (\"help\" if you don't know)");

            String option = sc.nextLine();
            switch(option) {
                case "help":
                    Engine.printMenu();
                    System.out.println();
                    break;
                case "1":
                    Engine.createBag(sc);
                    System.out.println("<<<The bag is ready!>>>");
                    System.out.println();
                    break;
                case "2":
                    Engine.receivePresents(sc);
                    System.out.println("<<<Thank you for the presents! They will make someone very happy!>>>");
                    System.out.println();
                    break;
                case "3":
                    Engine.combineBags(sc);
                    System.out.println();
                    break;
                case "4":
                    Engine.sharePresents(sc);
                    System.out.println();
                    break;
                case "5":
                    Engine.seeWhatYouHave(sc);
                    System.out.println();
                    break;
                case "6":
                    System.out.println("<<<Ok bye!>>>");
                    keyword = false;
                    break;
                default:
                    System.out.println("<<<Try again...>>>");
                    System.out.println();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("help - Find out how can you make someone happy! \n"
                + "(1) - First choose the type of bag you want for the presents \n"
                + "(2) - donate presents! \n"
                + "(3) - you can combine bags! \n"
                + "(4) - Share the presents! \n"
                + "(5) - See what you have in a bag + bag type \n"
                + "(6) - You finished sharing gifts!");
    }

    public static void createBag(Scanner sc) {
        System.out.println("What type of bag do you want? OPTIONS:\t\"RANDOM\" \t \"FIFO\"  \t \"LIFO\"");
        String type = sc.nextLine();
        System.out.println("Choose what to do while sharing: \"Sing\" or \"Hug\" or \"Applause\"");
        String excitment = sc.nextLine();
        excitment = excitment.toLowerCase();
        switch (excitment) {
            case "sing":
                GiveSurprises give = new GiveSurpriseAndSing(type, 5);
                giveSurprises.add(give);
                return;
            case "hug":
                GiveSurprises give1 = new GiveSurpriseAndHug(type, 5);
                giveSurprises.add(give1);
                return;
            case "applause":
                GiveSurprises give2 = new GiveSurpriseAndApplause(type, 5);
                giveSurprises.add(give2);
                return;
            default:
                System.out.println("Try again...");
                return;
        }
    }

    public static void receivePresents(Scanner sc) {
        System.out.println("Choose how many gifts do you want to donate: ");
        int number = sc.nextInt();
        sc.nextLine();
        GiveSurprises give;
        if (giveSurprises.size() < 1) {
            System.out.println("First choose a bag...");
            return;
        } else if (giveSurprises.size() > 1){
            System.out.println("There are " + giveSurprises.size() + " bags." + "Choose in which bag you want to donate: ");
            int bag_no = sc.nextInt();
            sc.nextLine();
            give = giveSurprises.get(bag_no - 1);
        } else {
            give = giveSurprises.get(0);
        }

        switch(number) {
            case 1:
                give.put(GatherSurprises.gather());
                break;
            case 0:
                System.out.println("No presents...");
                break;
            default:
                ArrayList <ISurprise> collection = GatherSurprises.gather(number);

                for (ISurprise surprise: collection ) {
                    give.put(surprise);
                }
                break;
        }
    }

    public static void combineBags(Scanner sc) {
        if (giveSurprises.size() < 1) {
            System.out.println("There are no bags...");
        } else if (giveSurprises.size() == 1) {
            System.out.println("There is only one bag...");
        } else if (giveSurprises.size() == 2) {
            System.out.println("There are two bags, let's combine them! Choose what bag to have in the end... (1) or (2)");
            String option = sc.nextLine();
            switch(option) {
                case "1":
                    giveSurprises.get(0).getSurpriseContainer().put(giveSurprises.get(1).getSurpriseContainer());
                    break;
                case "2":
                    giveSurprises.get(1).getSurpriseContainer().put(giveSurprises.get(0).getSurpriseContainer());
                    break;
            }
        } else {
            System.out.println("There are " + giveSurprises.size() + " bags. Which ones do you want to combine? First will be the one that will have all the presents!");
            int option1 = sc.nextInt();
            sc.nextLine();
            int option2 = sc.nextInt();
            sc.nextLine();
            giveSurprises.get(option1 - 1).getSurpriseContainer().put(giveSurprises.get(option2 - 1).getSurpriseContainer());

        }
    }

    public static void seeWhatYouHave (Scanner sc) {

        if (giveSurprises.size() < 1) {
            System.out.println("There are no bags...");
        } else if (giveSurprises.size() == 1) {
            System.out.print("There is only one bag: \t" + "type: " + giveSurprises.get(0).getSurpriseContainer().getType() + "\t" + "no of presents: "
                    + giveSurprises.get(0).getSurpriseContainer().size() + "\t");
            System.out.println(giveSurprises.get(0).getSurpriseContainer());
        } else {
            System.out.println("There are " + giveSurprises.size() + " bags. Choose one: ");
            int option = sc.nextInt();
            sc.nextLine();
            System.out.print("The bag no " + option + ": \t" + "type: " + giveSurprises.get(option - 1).getSurpriseContainer().getType() + "\t"
                    + "no of presents: " + giveSurprises.get(option - 1).getSurpriseContainer().size() + "\t");
            System.out.println(giveSurprises.get(option - 1).getSurpriseContainer());
        }
    }

    public static void sharePresents (Scanner sc) {

        System.out.println("Choose how many presents you want to give: ");
        int option = sc.nextInt();
        sc.nextLine();
        if (giveSurprises.size()  > 1) {

            System.out.println("Choose from which bag you want to give presents: (" + giveSurprises.size() + ")");
            int option1 = sc.nextInt();
            sc.nextLine();

            if (giveSurprises.get(option1 - 1).getSurpriseContainer().isEmpty()) {
                System.out.println("This bag is empty...");
                return;
            }
            if (option == 1) {
                giveSurprises.get(option1 - 1).give();
            } else if (option < giveSurprises.get(option1 - 1).getSurpriseContainer().size()) {
                while (option > 0) {
                    giveSurprises.get(option1 - 1).give();
                    option--;
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            } else {
                giveSurprises.get(option1 - 1).giveAll();
            }
        } else if (giveSurprises.size() == 1) {
            if (option == 1) {
                giveSurprises.get(0).give();

            } else if (option < giveSurprises.get(0).getSurpriseContainer().size()) {

                while (option > 0) {
                    giveSurprises.get(0).give();
                    option--;
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            } else {
                giveSurprises.get(0).giveAll();
            }
        }
    }

//	private static void share1Present(Scanner sc) {
//		System.out.println("Choose from which bag you want to give presents: (" + giveSurprises.size() + ")");
//		int option1 = sc.nextInt();
//		sc.nextLine();
//
//		if (giveSurprises.get(option1 - 1).getIBag().isEmpty()) {
//			System.out.println("This bag is empty...");
//			return;
//		}
//		if (giveSurprises.size() == 1) {
//			giveSurprises.get(0).giveWithPassion();
//			giveSurprises.get(0).give();
//		} else {
//			giveSurprises.get(option1 - 1).giveWithPassion();
//			giveSurprises.get(option1 - 1).give();
//		}
//	}



}
