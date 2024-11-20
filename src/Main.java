import java.util.ArrayList;
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


        Activities user = new Activities();
        // childhood
            System.out.println("As a child, you can interact with your parents or play by yourself");
            Scanner childhood = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Type 'mom' to spend time with your mother");
                System.out.println("Type 'dad' to spend time with your father");
                System.out.println("Type 'alone' to play with toys by yourself");
                String choice = childhood.nextLine();
                System.out.println(user.childhoodActivity(choice));
            }


        System.out.println("Now it's time to start school");
        System.out.println("You can now choose to study, and depending on which subject you choose, you will be asked questions about it");
        System.out.println("If you get all the questions right, you will become a master at that subject!");
        System.out.println("Note: You only get two chances to take the test");
        System.out.println("Getting one question wrong means you FAIL the test");
        System.out.println("Doing bad in subjects will affect your ability to get a job in the future");

        System.out.println("Math Quiz:");
        School studentQuiz = new School();
        Scanner userInput = new Scanner(System.in);
        String[] questions = {"How many thousands are in a million?",  "Which value is the smallest prime number?"};

        ArrayList userAnswers = new ArrayList();
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswers.add(userInput.nextInt());

        }

        String result = studentQuiz.quiz1Math(userAnswers);
        System.out.println(result);




            // teen years
            if(user.getAge() == 10){
                System.out.println("You are now allowed to meet new people and make friends!");
            }
            Scanner meetFriend = new Scanner(System.in);
        System.out.println("Do you want to meet a new person?");

            for (int i = user.getAge(); i<=16; i++)
            {
                System.out.println("Do you want to meet new people?");
                String ifMeet = meetFriend.nextLine();
                System.out.println(user.meetNewPeople());

            }

        Scanner countFriends = new Scanner(System.in);
        System.out.println("Type 'yes' to find out how many friends you have or 'no' if you don't want it");
        String numFriends = countFriends.nextLine();
        System.out.println(user.getFriend(numFriends));


// job
        System.out.println("You became an adult, so now you have to choose a job. Based on your quiz results you can choose the following jobs");



        // activities until death
        System.out.println("You can choose from the following activities. All of these activities are dangerous and there is a chance that you will die.");



    }
}
