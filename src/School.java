public class School {
    private int attempt;

    public School(){}

    public String quiz1Math(){
        String[] mathQuestions = { "How many thousands are in a million?", "What is 4 divided by 2?"};
        for (int i = 0; i< mathQuestions.length;i++){
            return mathQuestions[i];
        }
        return "";
    }
    // do the subject quizzing methods here

}
