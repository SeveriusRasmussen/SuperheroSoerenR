import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Database heroDatabase = new Database();
        Object superherolist = heroDatabase.getSuperHeroList(); // get fra Databasen linje 23
        int capacity = heroDatabase.getCapacity(); // get fra Databasen linje 27
        int count = 0;

        // intro hvis vi har mindre end fem superhelte på listen.
        System.out.println("Welcome to your superhero database!");
        while (count <= capacity) {

            System.out.println("1. Add superhero: ");
            System.out.println("2. Search Superhero: ");
            System.out.println("6. Show list: ");
            System.out.println("9. Tell Vegeta to blast the program out");
            String nextMove = scanner.nextLine();

            if (nextMove.equals("1") && (count < capacity)) {

                System.out.println("Write the name of your superhero");
                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("\nWrite the real name of the superhero");
                System.out.println("Superhero's real name: ");
                String realName = scanner.nextLine();

                System.out.println("\nWhich superpower do the superhero have?");
                System.out.println("The superpower is: ");
                String superPower = scanner.nextLine();

                System.out.println("\nIn which year was your superhero created?");
                System.out.println("Your superhero was created in the year: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("You must give a whole number instead of letters");
                    scanner.next();
                }
                double yearCreated = scanner.nextDouble();

                System.out.println("\nAre the superhero a human?");
                System.out.println("Write either yes or no");
                String isHuman = scanner.next();
                if (isHuman.equalsIgnoreCase("no")) { // || isHuman.equalsIgnoreCase("nej") || isHuman.equalsIgnoreCase("nope")){
                    System.out.println("WHAT, THE SUPERHERO IS A MONSTER!!!");
                } else {
                    System.out.println("Oh the superhero one of us! Welcome to Earth!");
                }

                System.out.println(
                        "\nWild Vegeta flew down and landed, then pressed his scouter to scan you" +
                        "\n*The scouter is scanning*" +
                        "\nThe scouter got max cap on 9 digits and scanned your strength which is: ");
                int strength = scanner.nextInt();
                if (strength >= 900000000) {
                    System.out.println("\nThe scouter exploded, and Vegeta died because his head was gone.\n");
                } else if (strength >= 9000) {
                    System.out.println("\n*Vegeta's scouter exploded*\nVegeta shouted out of pain while holding on his side of head 'OVER 9000?!! DAMN IT!'\n");
                } else {
                    System.out.println("\nVegeta became confused: 'Huh? Is that all you've got?'\n*Vegeta is rolling on the floor laughing because you're weak*\n");
                }

                heroDatabase.addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);

                count++;
                    /* Noget med at en booleon i overskud gør at der er en ekstra
                    "nextline" i bufferen som skydes af når loopet gentages */
                scanner.nextLine();

            }
            if (nextMove.equals("2")) {
                System.out.println("Vegeta uses his scouter to find information on an specified superhero");

            }
            if (nextMove.equals("6") && (count == capacity)) {
                System.out.println("You have added the maximum number of heroes to the list");
            }
            if (nextMove.equals("9")) {
                System.out.println("Vegeta blasted the whole program and reduces it to nothing");
                System.exit(0);
            }
            if (nextMove.equals("6")) {
                System.out.println(superherolist);
            }
             /* else {
                System.out.println("IMPOSSIBLE!");
            }*/
        }
    }
}