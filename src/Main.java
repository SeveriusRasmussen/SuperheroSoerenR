import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Database heroDatabase = new Database();
        int capicity = heroDatabase.getListSize();
        int count = 0;

        while (capicity >= count) {
            System.out.println("Welcome to your superhero database! ");
            System.out.println("1.Add superhero: ");
            System.out.println("6.Show superhero list: ");
            System.out.println("9.Exit program: ");
            Scanner keyboard = null;
            String nextMove = keyboard.nextLine();
            if (nextMove.equals("1") && capicity < count) {

                System.out.println();
                keyboard = new Scanner(System.in);
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

            if (nextMove.equals("9")) {
                System.exit(0);
            }

            }
        }
    }