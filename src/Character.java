public class Character {
    private String name;
    private String nationality;
    private String ethnicity;

    private boolean isAlive;


    public Character(String name) {
        this.name = name;
    }

    // randomly generates nationality for user
    public void generateNationality() {
        String[] genNationality = {"Mexico", "Australia", "Russia"};
        int num = (int) (Math.random() * genNationality.length);
        nationality = genNationality[num];
    }

    public void generateEthnicity() {
        String[] genEthnicity = {"American", "Spanish", "Indian"};
        int num = (int) (Math.random() * genEthnicity.length);
        ethnicity = genEthnicity[num];
    }

    public String generateFamily() {
        String[] motherName = {"Maria", "Anna", "Karen"};
        String[] fatherName = {"John", "Matthew", "Raymond"};

        String[] lastNameArray = name.split(" ");
        String lastName = lastNameArray.length > 1 ? lastNameArray[1] : ""; // Check if there's a last name

        int numM = (int) (Math.random() * motherName.length);
        int numF = (int) (Math.random() * fatherName.length);

        String mother = motherName[numM] + " " + lastName;
        String father = fatherName[numF] + " " + lastName;

        return "Your mother is " + mother + "\n" + "Your father is " + father;
    }


    // Simple description of character
    public String getDescription() {
        return "Your name is " + name + "\n" + "You live in " + nationality + "\n" + "Your parents are " + ethnicity;
    }


    public boolean getIsAlive() {
        return isAlive;
    }



    public boolean attemptDeath(String activity) {
        if (isAlive) {
            double deathChance = 0.0;

            switch (activity) {
                case "dangerous sport":
                    deathChance = 0.1; // 10% chance
                    break;
                case "adventure":
                    deathChance = 0.05; // 5% chance
                    break;
                case "bad habit":
                    deathChance = 0.2; // 20% chance
                    break;
                default:
                    deathChance = 0.01; // 1% chance for other activities
            }

            if (Math.random() < deathChance) {
                isAlive = false;
                return true;
            }
        }
        return false;


    }
}
