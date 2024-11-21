import java.util.ArrayList;

public class Activities {
    private int age;
    private int friends;
    private Character character;
    private boolean isAlive;

    public Activities() {
    }

    public Activities(int age) {
        this.age = age;
    }

    public Activities(Character character) {
        this.character = character;
    }

    public int getAge() {
        return age;
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
        String newF = friendName.get((int) (Math.random() * friendName.size()));
        friendName.remove(friendName.indexOf(newF));
        friends++;
        if (approval.toLowerCase().equals("yes")) {
            return "You made a new friend!" + "\n" + "His name is " + newF;
        } else {
            return "ok";
        }
    }

    public String getFriend(String isTrue) {
        if (isTrue.equals("yes")) {
            return "You have " + friends + " friends";
        } else {
            return "Suit yourself.";
        }
    }

    public boolean attemptDeath(int activityNum) {
        if (isAlive) {
            double deathChance = 0.0;

            switch (activityNum) {
                case 1:
                    deathChance = 0.4;
                    break;
                case 2:
                    deathChance = 0.3;
                    break;
                case 3:
                    deathChance = 0.2;
                    break;
                default:
                    deathChance = 0.1;
            }

            if (Math.random() < deathChance) {
                isAlive = false;
                return true;
            }

        }
        return true;
    }


    public String riskyActivity(int num) {
        if (!isAlive) {
            return "You are no longer alive and cannot perform activities.";
        }

        boolean isDead = attemptDeath(num);

        if (isDead) {
            return "Unfortunately, you died.";
        } else {
            return "You survived this time.";
        }
    }

}
