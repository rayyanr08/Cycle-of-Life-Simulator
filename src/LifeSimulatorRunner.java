import java.util.ArrayList;
import java.util.Scanner;

public class LifeSimulatorRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the cycle of life! ");
        System.out.println("---------------------------------");
        System.out.println("This game simulates your life in an imaginary world.");
        System.out.println("You perform different tasks as a child and as you get older, you will unlock more activities to do");
        System.out.println("With each activity you perform, you spend one year of your life");
        System.out.println("Let's get started!");
        System.out.println("---------------------------------");


        // Asking user for name
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your FULL name: ");
        String rName = name.nextLine();

        System.out.println("---------------------------------");
        Character person = new Character(rName);
        person.generateEthnicity();
        person.generateNationality();

        System.out.println(person.generateFamily());
        System.out.println(person.getDescription());
        System.out.println("---------------------------------");


        Activities user = new Activities();

        // childhood
            System.out.println("As a child, you can interact with your parents or play by yourself");
            Scanner childhood = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("---------------------------------");
                System.out.println("Type 'mom' to spend time with your mother");
                System.out.println("Type 'dad' to spend time with your father");
                System.out.println("Type 'alone' to play with toys by yourself");
                String choice = childhood.nextLine();
                System.out.println(user.childhoodActivity(choice));
            }


        System.out.println("Now it's time to start school");
        System.out.println("You can now choose to study, and depending on which subject you choose, you will be asked questions about it");
        System.out.println("If you get all the questions right, you will become a master at that subject!");
        System.out.println("Note: You only get one chances to take the test");
        System.out.println("Getting the first question OR both questions wrong means you FAIL the test");
        System.out.println("Doing bad in subjects will affect your ability to get a job in the future");


        //MATH QUIZ
        System.out.println("Math Quiz:");
        System.out.println("---------------------------------");
        School studentQuiz = new School();
        Scanner userInput = new Scanner(System.in);


        String[] questions = {"How many thousands are in a million?", "Which value is the smallest prime number?"};


        ArrayList<Integer> userAnswers = new ArrayList<>();
        for (String question : questions) {
            System.out.println(question);
            userAnswers.add(userInput.nextInt());
        }

        String result = studentQuiz.quiz1Math(userAnswers);
        System.out.println(result);
        user.addAge();
        System.out.println("You are now " + user.getAge() + " years old");
        System.out.println("---------------------------------");

        // SCIENCE QUIZ
        System.out.println("Science Quiz:");
        System.out.println("---------------------------------");
        Scanner userInput2 = new Scanner(System.in);

        String[] questionsScience = {"How many bones do sharks have in their body?", "How many teeth does a human adult have?"};

        ArrayList<Integer> userAnswersScience = new ArrayList<>();
        for (String question : questionsScience) {  // Loop through the correct questions array
            System.out.println(question);
            userAnswersScience.add(userInput2.nextInt());  // Add answers to the correct list
        }

        String resultScience = studentQuiz.quiz1Science(userAnswersScience);
        System.out.println(resultScience);
        user.addAge();
        System.out.println("You are now " + user.getAge() + " years old");
        System.out.println("---------------------------------");

        // ENGLISH QUIZ
        System.out.println("English Quiz:");
        System.out.println("---------------------------------");
        Scanner userInput3 = new Scanner(System.in);

        String[] questionsEnglish = {"Which year was Romeo and Juliet published?", "How many lines are in a sonnet?"};

        ArrayList<Integer> userAnswersEnglish = new ArrayList<>();
        for (String question : questionsEnglish) {
            System.out.println(question);
            userAnswersEnglish.add(userInput3.nextInt()); // Correctly add answers to userAnswersEnglish
        }

        String resultEnglish = studentQuiz.quiz1English(userAnswersEnglish); // Pass the correct list
        System.out.println(resultEnglish);
        user.addAge();
        System.out.println("You are now " + user.getAge() + " years old");
        System.out.println("---------------------------------");


        // teen years
            if(user.getAge() == 8){
                System.out.println("You are now allowed to meet new people and make friends!");
            }
            Scanner meetFriend = new Scanner(System.in);
            for (int i = user.getAge(); i<=16; i++)
            {
                System.out.println("Do you want to meet a new person? (type 'yes' or 'no')");
                String ifMeet = meetFriend.nextLine();
                System.out.println(user.meetNewPeople(ifMeet));
                System.out.println(user.getAgeString());

            }

        Scanner countFriends = new Scanner(System.in);
        System.out.println("Type 'yes' to find out how many friends you have or 'no' if you don't want it");
        String numFriends = countFriends.nextLine();
        System.out.println(user.getFriend(numFriends));
        System.out.println("---------------------------------");


        System.out.println("Now it's time to choose a job");
        System.out.println("Based on the quiz results you had earlier, you will be able to choose a job");
        Job player = new Job(studentQuiz);
        if (studentQuiz.getMath()){
            System.out.println(player.jobInterest("math"));
        }
        if (studentQuiz.getScience()){
            System.out.println(player.jobInterest("medicine"));
        }
        if (studentQuiz.getEnglish()){
            System.out.println(player.jobInterest("Humanities"));
        }
        Scanner jobChoice = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Which job will you choose? (P.S)");
        System.out.println("Write the EXACT WORD for the job     (Example: doctor, dentist, social worker, math teacher, journalist, etc.");
        System.out.println("If you don't see any options then you failed every test, meaning you won't be hired. Just write 'nothing'");
        String importantJobChoice = jobChoice.nextLine();
        player.jobPay(importantJobChoice);
        System.out.println(player.getSalary());
        user.addAge();
        System.out.println(user.getAgeString());




        // activities until death
        System.out.println("You can choose from the following activities. All of these activities are dangerous and there is a chance that you will die.");
        Activities finalStage = new Activities();
        Scanner possibleDeath = new Scanner(System.in);

        // Prompt the user for their choice of risky activity
        while (finalStage.getIsAlive()) {
            System.out.println("Enter a risky activity you'd like to attempt:");
            System.out.println("Type 1 to Climb the tallest building in your area");
            System.out.println("Type 2 to explore an abandoned cave");
            System.out.println("Type 3 to work all day");
            int userChoice = Integer.parseInt(possibleDeath.nextLine());

            String resultrisky = finalStage.riskyActivity(userChoice);
            System.out.println(resultrisky);
            user.addAge();
            System.out.println("Age: " + user.getAge());
            System.out.println();
        }



    }
}
