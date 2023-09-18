import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void StartProgram() {

        //delopgave #2 Creating a menu with 1. "Create a Superhero" and 9. "Exit the program"
        final int CREATE_HERO = 1;
        final int SUPERHERO_LIST = 4;
        final int SEARCH_SUPERHERO = 7;
        final int EDIT_SUPERHERO = 8;
        final int EXIT_PROGRAM = 9;
        int choice;

        System.out.println("Welcome to Superhero Universe with Vegeta");

        Database database = new Database();
        Scanner keyboard = new Scanner(System.in);

        // Object superherolist = database.getSuperherolist(); // get fra Databasen linje 23

        do {
            System.out.println("""
                    Choose a number:
                    1. Create a Superhero
                    4. Print the Superhero list
                    7. Search for a Superhero
                    8. Change one of the Superheroes
                    9. Tell Vegeta to blast the whole program out
                    """);
            while (!keyboard.hasNextInt()) {
                keyboard.nextLine();
                System.out.println("Enter a number: ");

            }

            choice = keyboard.nextInt();
            // HVordan laver man en keyboardnextLine() hvor det viser at man skal skrive tal istedet for fejlen
            keyboard.nextLine(); // Clearer scanneren

            if (choice == CREATE_HERO) {

                System.out.println("Creating a new superhero...\n");
                System.out.println("Write the name of your superhero");
                System.out.println("Name: ");
                String name = keyboard.nextLine();

                System.out.println("\nWrite the real name of the superhero");
                System.out.println("Superhero's real name: ");
                String realName = keyboard.nextLine();

                System.out.println("\nWhich superpower do the superhero have?");
                System.out.println("The superpower is: ");
                String superPower = keyboard.nextLine();

                System.out.println("\nIn which year was your superhero created?");
                System.out.println("Your superhero was created in the year: ");
                while (!keyboard.hasNextInt()) {
                    System.out.println("You must give a whole number instead of letters");
                    keyboard.nextLine(); // Tømmer inputbufferen for at undgå uendelig løkke
                }
                int yearCreated = keyboard.nextInt();

                System.out.println("\nAre the superhero a human?");
                System.out.println("Write either yes or no");
                String isHuman = keyboard.next();
                if (isHuman.equalsIgnoreCase("no") || isHuman.equalsIgnoreCase("nope") || isHuman.equalsIgnoreCase("nej")){
                    System.out.println("WHAT, THE SUPERHERO IS A MONSTER!!!");
                } else if (isHuman.equalsIgnoreCase("yes") || isHuman.equalsIgnoreCase("ye") || isHuman.equalsIgnoreCase("ja")) {
                    System.out.println("Oh the superhero one of us! Welcome to Earth!");
                } else {
                    System.out.println("What? I don't quite get that, can you please say yes/no?");
                }

                System.out.println("""
                        \nWild Vegeta flew down and landed, then pressed his scouter to scan you
                        *The scouter is scanning*
                        The scouter got a capacity on max 9 digits and scanned your strength which is:
                        """);
                int strength = keyboard.nextInt();
                if (strength >= 900000000) {
                    System.out.println("\nThe scouter exploded, and Vegeta died because his head was gone.\n");
                } else if (strength >= 9000) {
                    System.out.println("\n*Vegeta's scouter exploded*" +
                    "\nVegeta shouted out of pain while holding on his side of head 'OVER 9000?!! DAMN IT!'\n");
                } else {
                    System.out.println("\nVegeta became confused: 'Huh? Is that all you've got?\n*Vegeta is rolling on the floor laughing because you're weak*\n");
                }

                Superhero hero = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
                database.addSuperhero(hero);

                System.out.println("New hero created:\n" + hero);


            } else if (choice == SUPERHERO_LIST) {
                System.out.println("Vegeta uses his scouter to find the list of the superheroes");
                System.out.println(database.getSuperherolist());

            } else if (choice == SEARCH_SUPERHERO) {
                System.out.println("'What superhero do you want me to search for?' Vegeta asked");
                String searchTerm = keyboard.nextLine();
                Superhero sh = database.findSuperhero(searchTerm);
                if (sh != null) { //
                    System.out.println("The superhero you searched for came up on Vegeta's scouter" + sh);
                } else {
                    System.out.println("""
                                    Vegeta is aggressively pressing his scouter wondering why that didn't work.
                                    'I guess there is no such superhero as you described?'
                                    """);
                }


            } else if (choice == EDIT_SUPERHERO) {
                System.out.println("What superhero do you wanna edit?");
                String brugerInput = keyboard.nextLine();

                //List over superhelterne


                //find superhelte
                ArrayList<Superhero> søgeResultat = database.findSuperheroes(brugerInput);
                Superhero superheroDerSkalRedigeres = null;

                //søgning finder ingen personer
                if (søgeResultat.size() == 0) {
                    System.out.println("No superheroes found");
                } else if (søgeResultat.size() > 1) {
                    //vælg en superhelt i søgeresultatet med flere personer
                    System.out.println("Choose a superhero");
                    int count = 1;
                    for (Superhero superhero : søgeResultat) {
                        System.out.println(count++ + "." + " " +
                                superhero.getName() + " " + " " +
                                superhero.getRealName() + " " + " " +
                                superhero.getSuperPower() + " " + " " +
                                superhero.getYearCreated() + " " + " " +
                                superhero.getIsHuman() + " " + " " +
                                superhero.getStrength());
                    }

                    int superheroValg = keyboard.nextInt();
                    keyboard.nextLine(); //clearer scanner
                    superheroDerSkalRedigeres = søgeResultat.get(superheroValg - 1);
                }
                //søgning finder 1 person
                else {
                    superheroDerSkalRedigeres = søgeResultat.get(0);
                }
                //Redigering af valgte personer

                if (superheroDerSkalRedigeres != null) {
                    System.out.println("Edit superhero stats. Press Enter if the stats do not need to get changed");
                    String nyVærdi;
                    System.out.println("Superhero name: " + superheroDerSkalRedigeres.getName());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheroDerSkalRedigeres.setName(nyVærdi);
                    }
                    System.out.println("Real name: " + superheroDerSkalRedigeres.getRealName());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheroDerSkalRedigeres.setRealName(nyVærdi);
                    }
                    System.out.println("Super power: " + superheroDerSkalRedigeres.getSuperPower());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheroDerSkalRedigeres.setSuperPower(nyVærdi);
                    }
                    System.out.println("Year created: " + superheroDerSkalRedigeres.getYearCreated());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheroDerSkalRedigeres.setYearCreated(Integer.parseInt(nyVærdi));
                    }
                    System.out.println("Is Human: " + superheroDerSkalRedigeres.getIsHuman());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheroDerSkalRedigeres.setIsHuman(nyVærdi);
                    }
                    System.out.println("Strength: " + superheroDerSkalRedigeres.getStrength());
                    nyVærdi = keyboard.nextLine();
                    if (!nyVærdi.isEmpty()) {
                        superheroDerSkalRedigeres.setStrength(Integer.parseInt(nyVærdi));
                    }
                    System.out.println(superheroDerSkalRedigeres + "is updated");
                }




            }
        } while (choice != EXIT_PROGRAM);
        System.out.println("Vegeta blasted the whole program and reduces it to nothing");
    }
}
