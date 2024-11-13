public class Character {
    private String name;
    private String nationality;
    private String ethnicity;
    public boolean isAlive;


    public Character (String name){
        this.name = name;
    }


    // randomly generates nationality for user
    public void generateNationality() {
        String[] genNationality = { "Mexico", "Australia", "Russia" };
        int num = (int)(Math.random() * genNationality.length);
        nationality = genNationality[num];
    }

    public void generateEthnicity() {
        String[] genEthnicity = { "American", "Spanish", "Indian" };
        int num = (int)(Math.random() * genEthnicity.length);
        ethnicity = genEthnicity[num];
    }

    public String generateFamily() {
        String[] motherName = { "Maria", "Anna", "Karen" };
        String[] fatherName = { "John", "Matthew", "Raymond" };
        
        String[] lastNameArray = name.split(" ");
        String lastName = lastNameArray.length > 1 ? lastNameArray[1] : ""; // Check if there's a last name

        int numM = (int)(Math.random() * motherName.length);
        int numF = (int)(Math.random() * fatherName.length);

        String mother = motherName[numM] + " " + lastName;
        String father = fatherName[numF] + " " + lastName;

        return "Your mother is " + mother + "\n" + "Your father is " + father;
    }


    // Simple description of character
    public String getDescription(){
        return "Your name is " + name + "\n" + "You live in " + nationality + "\n" + "Your parents are " + ethnicity;
    }


}
