import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Your superhero name is: ");
        String name = keyboard.next();
        System.out.println("Your real name is: ");
        String realname = keyboard.next();
        System.out.println("Your superpower is: ");
        String superPower = keyboard.next();
        System.out.println("You was created in: ");
        String yearCreated = keyboard.next();
        System.out.println("Are you a human?");
        Boolean isHuman = keyboard.hasNextBoolean();
        System.out.println("How strong are you?");
        double strength = keyboard.nextDouble();

    }



}
