public class Character {
    private String name;
    private String nationality;
    private String ethnicity;


    // randomly generates nationality for user
    public void generateNationality(){
        String genNationality = "";

    }

    public void generateEthnicity(){
        String genEthnicity = "";

    }

    public Character (String name, String nationality, String ethnicity){
        this.name = name;
        this.nationality = nationality;
        this.ethnicity = ethnicity;
    }


    // Simple description of character
    public String getDescription(){
        return "Your name is " + name + "\n" + "You live in " + nationality + "\n" + "Your parents are " + ethnicity;
    }





}
