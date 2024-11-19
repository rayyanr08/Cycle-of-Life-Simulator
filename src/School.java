public class School {
    private int attempt;

    public School() {
    }

    public String quiz1Math(int number) {
        String[] mathQuestions = {"How many thousands are in a million?", "Which value is the smallest prime number?"};
        Integer[] mathAnswers = {1000, 2};
        boolean isTrue = true;
        if (isTrue) {
            for (int i = 0; i <= mathQuestions.length; i++) {
                if (number != mathAnswers[i]) {
                    return "Incorrect! YOU FAIL";
                } else {
                    return "Correct! YOU PASS";
                }

            }
        }
        return "";
    }
}
