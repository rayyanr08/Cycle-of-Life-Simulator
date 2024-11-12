public class Character {
    private String name;
    private String nationality;
    private String ethnicity;


    public Character (String name, String nationality, String ethnicity){
        this.name = name;
        this.nationality = nationality;
        this.ethnicity = ethnicity;
    }


    // randomly generates nationality for user
    public void generateNationality(){
        String[] genNationality = {"Mexico, Australia, Russia"};
        int num = (int)(Math.random() * genNationality.length);
        nationality = genNationality[num];

    }

    public void generateEthnicity(){
        String[] genEthnicity = {"American, Spanish, Indian"};
        int num = (int)(Math.random() * genEthnicity.length);


    }


    // Simple description of character
    public String getDescription(){
        return "Your name is " + name + "\n" + "You live in " + nationality + "\n" + "Your parents are " + ethnicity;
    }





}
