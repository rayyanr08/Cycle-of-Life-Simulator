import java.util.ArrayList;

public class School {
    private int attempt;

    public School() {
    }

    public String quiz1Math(ArrayList<Integer> userAns) {
        String[] mathQuestions = {"How many thousands are in a million?", "Which value is the smallest prime number?"};
        Integer[] mathAnswers = {1000, 2};


        for (int i = 0; i < mathQuestions.length; i++) { // Use correct loop bounds
            if (!userAns.get(i).equals(mathAnswers[i])) { // Use `.equals()` for comparison
                return "Incorrect! YOU FAIL";
            }
        }
        return "YOU PASS";
    }


    public String quiz1Science(ArrayList<Integer> userAns) {
        String[] scienceQuestions = {"How many bones do sharks have in their body?", "How many teeth does a human adult have?"};
        Integer[] scienceAnswers = {0, 32};
            for (int i = 0; i <= scienceQuestions.length; i++) {
                if (Integer.valueOf(userAns.get(i)) != Integer.valueOf(scienceAnswers[i])) {
                    return "Incorrect! YOU FAIL";
                } else {
                    return "YOU PASS!";
                }
            }
            return "";
        }

    public String quiz1English(ArrayList<Integer> userAns) {
        String[] englishQuestions = {"Which year romeo and juliet published in?", "How many lines are in a sonnet?"};
        Integer[] englishAnswers = {1597, 32};
        boolean isTrue = true;
        if (isTrue) {
            for (int i = 0; i <= englishQuestions.length; i++) {
                if (userAns.get(i) != englishAnswers[i]) {
                    return "Incorrect! YOU FAIL";
                } else {
                    return "YOU PASS!";
                }
            }
        }
        return "";
    }



}
