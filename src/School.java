import java.util.ArrayList;

public class School {
    private boolean mathOutcome;
    private boolean scienceOutcome;
    private boolean englishOutcome;

    public School() {
    }

    public String quiz1Math(ArrayList<Integer> userAns) {
        String[] mathQuestions = {"How many thousands are in a million?", "Which value is the smallest prime number?"};
        Integer[] mathAnswers = {1000, 2};


        for (int i = 0; i < mathQuestions.length; i++) {
            if (userAns.get(i).equals(mathAnswers[i])) {
                mathOutcome = true;
                return "YOU PASS";
            } else {
                mathOutcome = false;
                return "Incorrect! YOU FAIL";
            }
        }
        return "";
    }


    public String quiz1Science(ArrayList<Integer> userAns) {
        String[] scienceQuestions = {"How many bones do sharks have in their body?", "How many teeth does a human adult have?"};
        Integer[] scienceAnswers = {0, 32};
            for (int i = 0; i <= scienceQuestions.length; i++) {
                if (userAns.get(i).equals(scienceAnswers[i])) {
                    scienceOutcome = true;
                    return "YOU PASS";
                } else {
                    scienceOutcome = false;
                    return "Incorrect! YOU FAIL";
                }
            }
            return "";
        }

    public String quiz1English(ArrayList<Integer> userAns) {
        String[] englishQuestions = {"Which year was Romeo and Juliet published?", "How many lines are in a sonnet?"};
        Integer[] englishAnswers = {1597, 14}; // Corrected answer for sonnet lines
        boolean allCorrect = true;

        for (int i = 0; i < englishQuestions.length; i++) { // Use <, not <=
            if (!userAns.get(i).equals(englishAnswers[i])) {
                allCorrect = false;
                break; // No need to check further if one answer is wrong
            }
        }

        if (allCorrect) {
            return "YOU PASS!";
        } else {
            return "Incorrect! YOU FAIL";
        }
    }

    public boolean getMath(){
        return mathOutcome;
    }

    public boolean getScience(){
        return scienceOutcome;
    }

    public boolean getEnglish(){
        return englishOutcome;
    }



}

