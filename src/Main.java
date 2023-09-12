import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Database heroDatabase = new Database();
        int capicity = heroDatabase.getListSize(); // get fra Databasen
        int count = 0;

        // intro hvis vi har mindre end fem superhelte på listen.
        while (capicity >= count) {
            System.out.println("Welcome to your superhero database! ");
            System.out.println("1.Add superhero: ");
            System.out.println("6.Show superhero list: ");
            System.out.println("9.Exit program: ");
            Scanner keyboard = new Scanner(System.in); // tutor: hvis denne er null virker det ikke til at .nextLine() kan afvikle.
            String nextMove = keyboard.nextLine();
            if (nextMove.equals("1") && capicity >= count) { // ændret fra <= til >= (se kommentar understående)
            /*
            Capacity er ikke mindre end count når vi ikke har nogen heroes i din liste.... Så er din Capacity = 0 og din count = 0.
            Derfor går den ikke ind in if sætning, og går ned til else i stedet. - tutor fortalt mig idag før frokosten.

            */

                System.out.println();
                // keyboard = new Scanner(System.in); <-- fejlen som gjorde at programmet ikke virker.
                System.out.println("Your superhero is: ");
                String name = keyboard.next();
                System.out.println("Your real name is:  ");
                String realName = keyboard.next();
                System.out.println("Your superpower is: ");
                String superPower = keyboard.next();
                System.out.println("You were created in: ");
                int yearCreated = keyboard.nextInt();
                System.out.println("Are you human?");
                String isHuman = keyboard.next();
                System.out.println("Your strength is: ");
                String strength = keyboard.next();
                System.out.println();

                heroDatabase.addHero(name, realName, superPower, yearCreated, isHuman, strength);
                count++;
                keyboard.nextLine();


            } else {
                System.out.println("Maximum hero capacity reached");
            }
            if (nextMove.equals("6")) {
                System.exit(0);
            }

            if (nextMove.equals("9")) {
                System.exit(0);
            }

            }
        }
    }