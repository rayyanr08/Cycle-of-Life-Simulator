import java.util.ArrayList;

public class Activities {
    private int age;
    private int friends;
    private boolean isAlive;

    public Activities() {
        isAlive = true;
    }

    public int getAge() {
        return age;
    }

    public String getAgeString(){
        return "You are " + age + " years old";
    }

    public void addAge() {
        age++;
    }

    public String childhoodActivity(String choice) {
        String year = " year";

        if (choice.equals("mom")) {
            ArrayList<String> momResponse = new ArrayList<String>();
            momResponse.add("She takes a video of you playing and sends it in the family groupchat");
            momResponse.add("She's too tired to play with you");
            momResponse.add("She gives you her phone to play with");

            age++;
            if (age > 1) {
                year = " years";
            }
            return momResponse.get((int) (Math.random() * momResponse.size())) + "\n" + "You are now " + age + year + " old";
        }

        if (choice.equals("dad")) {
            ArrayList<String> dadResponse = new ArrayList<String>();
            dadResponse.add("He takes you to the store and buys you a toy");
            dadResponse.add("He's sleeping and doesn't hear you");
            dadResponse.add("He sits down and watches TV with you");
            age++;
            if (age > 1) {
                year = " years";
            }
            return dadResponse.get((int) (Math.random() * dadResponse.size())) + "\n" + "You are now " + age + year + " old";

        }

        if (choice.equals("alone")) {
            ArrayList<String> playAlone = new ArrayList<String>();
            playAlone.add("You get bored and fall asleep on the carpet");
            playAlone.add("You have the most fun of your life while playing with action figures!");
            playAlone.add("You accidentally break your toy");
            age++;
            if (age > 1) {
                year = " years";
            }
            String outcome = playAlone.get((int) (Math.random() * playAlone.size()));
            if (playAlone.indexOf(outcome) == 2) {
                playAlone.remove(playAlone.indexOf(outcome));
            }

            return outcome + "\n" + "You are now " + age + year + " old";
        }

        return "";
    }

    public String meetNewPeople(String approval) {

        ArrayList<String> friendName = new ArrayList<String>();
        friendName.add("Marcus");
        friendName.add("Jacob");
        friendName.add("Sam");
        friendName.add("Andrew");
        friendName.add("Nathaniel");

        String newF = friendName.get((int) (Math.random() * friendName.size()));
        friendName.remove(friendName.indexOf(newF));
        if (approval.toLowerCase().equals("yes")) {
            friends++;
            age++;

            return "You made a new friend!" + "\n" + "His name is " + newF;
        } else if (approval.toLowerCase().equals("no")) {
        age++;
        return "ok";
        }
        age++;
        return "ok";
    }

    public String getFriend(String isTrue) {
        if (isTrue.equals("yes")) {
            return "You have " + friends + " friend(s)";
        } else {
            return "Suit yourself.";
        }
    }


    public boolean attemptDeath(int activityNum) {
            int deathChance = 0;

            if (activityNum == 1){
                deathChance = 50;
            } else if (activityNum == 2) {
                deathChance = 40;
            } else if (activityNum == 3) {
                deathChance = 35;
            }

            if ((int)(Math.random() * 100) <= deathChance) {
                isAlive = false;
                return true;
            }
        return false;
    }

    public boolean getIsAlive(){
        return isAlive;
    }


    public String riskyActivity(int num) {
        boolean isDead = attemptDeath(num);

        if (isDead) {
            return "Unfortunately, you died.";
        } else {
            return "You survived this time.";
        }
    }

}
