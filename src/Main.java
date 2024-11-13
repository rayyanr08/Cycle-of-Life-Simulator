import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the cycle of life! ");
        System.out.println("This game simulates your life in an imaginary world.");
        System.out.println("You can interact with different people and perform different activities while trying to maintain a reputation");
        System.out.println("Let's get started!");


        // Asking user for name
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your FULL name: ");
        String rName = name.nextLine();

        Character person = new Character(rName);
        person.generateEthnicity();
        person.generateNationality();

        System.out.println(person.generateFamily());
        System.out.println(person.getDescription());
        System.out.println(person.generateReputation());
    }
}
