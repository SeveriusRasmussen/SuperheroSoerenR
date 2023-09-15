import java.util.Scanner;

public class UserInterface {
    public void StartProgram() {
        System.out.println("Start program UserInterface.");
        final int CREATE_HERO = 1;
        final int SUPERHERO_LIST = 4;
        final int SEARCH_SUPERHERO = 7;
        final int EXIT_PROGRAM = 9;
        int choice;

        System.out.println("Welcome to your superhero database!");

        Database database = new Database();
        Scanner keyboard = new Scanner(System.in);


        Object superherolist = database.getSuperherolist(); // get fra Databasen linje 23

        int count = 0;

        // intro hvis vi har mindre end fem superhelte på listen.

        do {
            System.out.println("\nMake your choice my good sir.");
            System.out.println("1. Create a Superhero");
            System.out.println("4. Print superhero list");
            System.out.println("7. Search for a superhero");
            System.out.println("9. Tell Vegeta to blast the program out");
            choice = keyboard.nextInt();

            if (choice == CREATE_HERO) {

                System.out.println("Creating a new superhero...\n");
                System.out.println("Write the name of your superhero");
                System.out.println("Name: ");
                String name = keyboard.next();

                System.out.println("\nWrite the real name of the superhero");
                System.out.println("Superhero's real name: ");
                String realName = keyboard.next();

                System.out.println("\nWhich superpower do the superhero have?");
                System.out.println("The superpower is: ");
                String superPower = keyboard.next();

                System.out.println("\nIn which year was your superhero created?");
                System.out.println("Your superhero was created in the year: ");
                while (!keyboard.hasNextInt()) {
                    System.out.println("You must give a whole number instead of letters");
                }
                int yearCreated = keyboard.nextInt();

                System.out.println("\nAre the superhero a human?");
                System.out.println("Write either yes or no");
                String isHuman = keyboard.next();
                if (isHuman.equalsIgnoreCase("no")) { // || isHuman.equalsIgnoreCase("nej") || isHuman.equalsIgnoreCase("nope")){
                    System.out.println("WHAT, THE SUPERHERO IS A MONSTER!!!");
                } else {
                    System.out.println("Oh the superhero one of us! Welcome to Earth!");
                }

                System.out.println(
                        "\nWild Vegeta flew down and landed, then pressed his scouter to scan you" +
                                "\n*The scouter is scanning*" +
                                "\nThe scouter got a capacity on max 9 digits and scanned your strength which is: ");
                int strength = keyboard.nextInt();
                if (strength >= 900000000) {
                    System.out.println("\nThe scouter exploded, and Vegeta died because his head was gone.\n");
                } else if (strength >= 9000) {
                    System.out.println("\n*Vegeta's scouter exploded*\nVegeta shouted out of pain while holding on his side of head 'OVER 9000?!! DAMN IT!'\n");
                } else {
                    System.out.println("\nVegeta became confused: 'Huh? Is that all you've got?'\n*Vegeta is rolling on the floor laughing because you're weak*\n");
                }

                Superhero hero = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
                database.addSuperhero(hero);

                System.out.println("New hero created:\n"+hero);


            } else if (choice == SUPERHERO_LIST) {
                System.out.println("Vegeta uses his scouter to find the list of the superheroes");
                System.out.println(database.getSuperherolist());

            } else if (choice == SEARCH_SUPERHERO) {
                System.out.println("Vegeta is asking: What superhero do you want me to search for?");
                String searchTerm = keyboard.nextLine();
                Superhero matchingSuperheroes = database.findSuperhero(searchTerm);

                if (matchingSuperheroes != null) {
                    System.out.println("Matching Superhero:\n" + matchingSuperheroes);
                } else {
                    System.out.println("Vegeta became confused as there is no matching superhero.");

                }
            }
        } while (choice != EXIT_PROGRAM);
        System.out.println("Vegeta blasted the whole program and reduces it to nothing");
    }
}
