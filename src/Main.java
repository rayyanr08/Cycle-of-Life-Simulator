import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the cycle of life! ");
        System.out.println("This game simulates your life in an imaginary world.");
        System.out.println("You perform different tasks as a child and as you get older, you will unlock more activities to do");
        System.out.println("With each activity you perform, you spend one year of your life");
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

        // childhood
        System.out.println("As a child, you can interact with your parents or play by yourself");
        Scanner childhood = new Scanner(System.in);
        Activities user = new Activities();
        for (int i = 0; i<5; i++) {
            System.out.println("Press 1 to spend time with your mother");
            System.out.println("Press 2 to spend time with your father");
            System.out.println("Press 3 to play with toys by yourself");
            int choice = Integer.parseInt(childhood.nextLine());
            System.out.println(user.childhoodActivity(choice));
        }



    }
}
